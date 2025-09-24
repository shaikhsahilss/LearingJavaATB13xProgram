package WiproInterview;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

/**
 * Read Excel, remove duplicates (based on selected columns), and write cleaned file.
 */
public class ExcelRemoveDuplicatesvalues{

    public static void main(String[] args) {
        // -------------- CONFIG --------------
        // Put your real path here (no extra quotes, use double backslashes on Windows)
        String inputPath  = "C:\\Users\\Sahil\\Downloads\\DummyExcelWithDuplicates.xlsx";
        String outputPath = "C:\\Users\\Sahil\\Downloads\\CleanedExcel.xlsx";

        // columns to ignore when checking duplicates (0-based). Here we ignore ID column index 0.
        Set<Integer> ignoreWhenCheckingDuplicates = Collections.singleton(0);
        // ------------------------------------

        try {
            // 1) read and remove duplicates
            List<List<String>> uniqueRows = readExcelWithoutDuplicates(inputPath, ignoreWhenCheckingDuplicates);

            // 2) print to console
            System.out.println("=== Unique Rows from Excel ===");
            uniqueRows.forEach(System.out::println);

            // 3) write cleaned rows to new Excel file
            writeExcel(uniqueRows, outputPath);
            System.out.println("Cleaned file written to: " + outputPath);

        } catch (IOException e) {
            System.err.println("Error handling Excel file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Reads the first sheet of the workbook and removes duplicate rows based on a key that
     * ignores columns listed in ignoreColumns.
     *
     * @param filePath      path to input .xlsx
     * @param ignoreColumns set of column indices (0-based) to *ignore* when checking duplicates
     * @return list of rows (each row is list of Strings). Header (first row) is always kept.
     * @throws IOException when file can't be read
     */
    public static List<List<String>> readExcelWithoutDuplicates(String filePath, Set<Integer> ignoreColumns) throws IOException {
        List<List<String>> result = new ArrayList<>();
        // keep track of seen row-keys to remove duplicates while preserving order
        Set<String> seenKeys = new LinkedHashSet<>();
        DataFormatter formatter = new DataFormatter();

        try (InputStream in = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(in)) {

            Sheet sheet = workbook.getSheetAt(0);
            boolean isFirstRow = true;

            for (Row row : sheet) {
                int lastCellNum = row.getLastCellNum(); // may be -1 for empty row, handle safely
                if (lastCellNum < 0) lastCellNum = 0;

                // read all cells in the row (creates blank cells for missing indices)
                List<String> rowData = new ArrayList<>();
                for (int c = 0; c < lastCellNum; c++) {
                    Cell cell = row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    rowData.add(formatter.formatCellValue(cell)); // formats dates/numbers nicely
                }

                if (isFirstRow) {
                    // treat first row as header — always keep it
                    result.add(rowData);
                    isFirstRow = false;
                } else {
                    // build a comparison key that excludes columns we want to ignore (e.g., ID)
                    String key = buildKeyIgnoringColumns(rowData, ignoreColumns);

                    if (!seenKeys.contains(key)) {
                        seenKeys.add(key);
                        result.add(rowData);
                    }
                }
            }
        }

        return result;
    }

    /**
     * Build a stable key for a row, ignoring specified column indices.
     * Normalizes values by trimming and converting to lower-case to avoid case/space duplicates.
     */
    private static String buildKeyIgnoringColumns(List<String> row, Set<Integer> ignoreColumns) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row.size(); i++) {
            if (ignoreColumns != null && ignoreColumns.contains(i)) continue;
            String cell = row.get(i) == null ? "" : row.get(i).trim().toLowerCase();
            sb.append(cell).append("||"); // separator unlikely to appear in normal data
        }
        return sb.toString();
    }

    /**
     * Writes the provided rows into an .xlsx file (single sheet named "Cleaned").
     *
     * @param rows    list of rows (each row is list of Strings)
     * @param outPath output .xlsx file path
     * @throws IOException if writing fails
     */
    public static void writeExcel(List<List<String>> rows, String outPath) throws IOException {
        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream fos = new FileOutputStream(outPath)) {

            Sheet sheet = workbook.createSheet("Cleaned");

            for (int r = 0; r < rows.size(); r++) {
                Row excelRow = sheet.createRow(r);
                List<String> rowData = rows.get(r);

                for (int c = 0; c < rowData.size(); c++) {
                    Cell cell = excelRow.createCell(c);
                    cell.setCellValue(rowData.get(c));
                }
            }

            // Optional: auto-size columns for nicer output
            if (!rows.isEmpty()) {
                int cols = rows.get(0).size();
                for (int c = 0; c < cols; c++) {
                    sheet.autoSizeColumn(c);
                }
            }

            workbook.write(fos);
        }
    }
}
