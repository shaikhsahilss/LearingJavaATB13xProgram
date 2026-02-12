//package WiproInterview;
//
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.*
//
//public class ExcelRemove2 {
//
//    public static void main(String[] args) {
//        String filepath ="C:\\Users\\Sahil\\Downloads\\DummyExcelWithDuplicates.xlsx";
//
//        List<List<String>> uniqueData = readExeclwithoutduplicates(filepath);
//
//        for (List<String> row : uniqueData){
//            System.out.println(row);
//        }
//    }
//
//    public static List<List<String>> readExeclwithoutduplicates(String filepath) throws FileNotFoundException {
//        Set<List<String>> uniqueRows = new LinkedHashSet<>();
//        DataFormatter formatter = new DataFormatter();
//       // try (FileInputStream fis = new FileInputStream(new File(filepath));
//          //  Workbook workbook = new XSSFWorkbook(fis) {
//         //   Sheet sheet = workbook.getSheetAt(0);
//            boolean isHeader = true;
//
//           // for(Row row : sheet){
//                List<String> rowData = new ArrayList<>();
//                for(int c =0; c< row.getLastCellNum(); c++){
//                    Cell cell = row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
//
//                    rowData.add(formatter.formatCellValue(cell));
//                }
//                if(isHeader){
//                    uniqueRows.add(rowData);
//                    isHeader =false;
//                } else {
//                    List<String> key = rowData.subList(1 ,rowData.size());
//                    boolean alreadyExists = uniqueRows.stream().anyMatch(r -> r.subList(1,r.size()).equals(key));
//
//                    if(!alreadyExists){
//                        uniqueRows.add(rowData);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            Throwable e;
//            e.printStackTrace();
//        }
//        return new ArrayList<>(uniqueRows);
//
//
//
//    }
//}
