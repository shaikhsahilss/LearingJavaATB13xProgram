package ResponseValidations;

public class jsonpayload {

    public static String getpayload(){
        return  "{\n" +
                "  \"user\": {\n" +
                "    \"id\": 101,\n" +
                "    \"name\": \"Sahil Shaikh\",\n" +
                "    \"email\": \"sahil.shaikh@example.com\",\n" +
                "    \"contact\": {\n" +
                "      \"phone\": \"+91-9876543210\",\n" +
                "      \"address\": {\n" +
                "        \"street\": \"MG Road\",\n" +
                "        \"city\": \"Pune\",\n" +
                "        \"state\": \"Maharashtra\",\n" +
                "        \"zip\": \"411001\",\n" +
                "        \"coordinates\": {\n" +
                "          \"lat\": 18.5204,\n" +
                "          \"long\": 73.8567\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"accounts\": [\n" +
                "    {\n" +
                "      \"accountId\": \"ACC1001\",\n" +
                "      \"type\": \"Savings\",\n" +
                "      \"balance\": 50000.75,\n" +
                "      \"transactions\": [\n" +
                "        {\n" +
                "          \"txnId\": \"TXN001\",\n" +
                "          \"amount\": 1500.00,\n" +
                "          \"status\": \"Success\",\n" +
                "          \"date\": \"2025-10-07\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"txnId\": \"TXN002\",\n" +
                "          \"amount\": 2000.50,\n" +
                "          \"status\": \"Pending\",\n" +
                "          \"date\": \"2025-10-06\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"accountId\": \"ACC1002\",\n" +
                "      \"type\": \"Current\",\n" +
                "      \"balance\": 125000.25,\n" +
                "      \"transactions\": [\n" +
                "        {\n" +
                "          \"txnId\": \"TXN003\",\n" +
                "          \"amount\": 3500.00,\n" +
                "          \"status\": \"Success\",\n" +
                "          \"date\": \"2025-10-05\"\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"roles\": [\"admin\", \"editor\", \"approver\"],\n" +
                "  \"isActive\": true,\n" +
                "  \"createdDate\": \"2025-10-01T10:30:00Z\"\n" +
                "}\n";
    }
}
