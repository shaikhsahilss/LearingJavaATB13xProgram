package PracticeHTTPMethod2ndRound.module1.Validateresposne;

import org.testng.annotations.Test;

public class payload {

    public static String wipro(){
        return "{\n" +
                "    \"responseCode\": 0,\n" +
                "    \"responseText\": \"Success\",\n" +
                "    \"divisionNumber\": 2160,\n" +
                "    \"customerNumber\": 10129203,\n" +
                "    \"productnumberadd\":5036896,\n" +
                "    \"productList\": [\n" +
                "        {\n" +
                "            \"productNumber\": 1242499,\n" +
                "            \"sequenceNumber\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"productNumber\": 1328699,\n" +
                "            \"sequenceNumber\": 2\n" +
                "        },\n" +
                "        {\n" +
                "            \"productNumber\": 1232499,\n" +
                "            \"sequenceNumber\": 3\n" +
                "        },\n" +
                "        {\n" +
                "            \"productNumber\": 1233199,\n" +
                "            \"sequenceNumber\": 4\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
