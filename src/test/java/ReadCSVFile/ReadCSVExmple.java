package ReadCSVFile;

import java.io.*;
import java.util.*;
public class ReadCSVExmple {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\Sahil\\Downloads\\dummy_data.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // split by Comma
                System.out.println(Arrays.toString(values));//            }

            }
        }catch (IOException e){
            e.printStackTrace();

    }
}
}
