package WiproInterview;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class SimpleExcelReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\Sahil\\Downloads\\DummyExcelWithDuplicates.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        wb.close();
        fis.close();
    }
}
