package ReadCSVFile;

import java.io.*;
import java.util.*;

public class ReadCSVRemoveDuplicates {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\Sahil\\Downloads\\dummy_data.csv";

        Set<String> uniqueRows = new LinkedHashSet<>(); // keeps order and removes duplicates

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            boolean isHeader = true;
            String header = "";

            while ((line = br.readLine()) != null) {
                if (isHeader) { // store header separately
                    header = line;
                    isHeader = false;
                    continue;
                }
                uniqueRows.add(line); // add each row to set
            }

            // Print header
            System.out.println(header);

            // Print unique rows
            for (String row : uniqueRows) {
                System.out.println(row);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
