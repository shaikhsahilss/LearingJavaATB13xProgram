package WiproInterview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.*;

public class excelfilereader {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Sahil\\Downloads\\DummyExcelWithDuplicates.xlsx");
        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheetAt(0);

        Set<String> set = new LinkedHashSet<>();
        for(Row row : sheet)
        {
            for(Cell cell : row ){
                System.out.print(cell + " ");
                set.add(String.valueOf(cell));
            }
            System.out.println( );
        }

        for(String val :set){
            System.out.print(val +" ");
        }

        wb.close();
        fis.close();
    }
}
