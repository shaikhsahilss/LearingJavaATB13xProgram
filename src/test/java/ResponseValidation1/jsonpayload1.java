package ResponseValidation1;

public class jsonpayload1 {
    public static String json(){
        return "{\n" +
                "  \"user\": {\n" +
                "    \"id\": 101,\n" +
                "    \"name\": \"Sahil Shaikh\",\n" +
                "    \"email\": \"sahil.shaikh@example.com\",\n" +
                "    \"profile\": {\n" +
                "      \"dob\": \"1995-07-15\",\n" +
                "      \"gender\": \"Male\",\n" +
                "      \"preferences\": {\n" +
                "        \"language\": \"en\",\n" +
                "        \"currency\": \"INR\",\n" +
                "        \"notifications\": {\n" +
                "          \"email\": true,\n" +
                "          \"sms\": false,\n" +
                "          \"push\": true\n" +
                "        }\n" +
                "      },\n" +
                "      \"socialAccounts\": [\n" +
                "        {\"platform\": \"LinkedIn\", \"username\": \"sahilshaikh\", \"connected\": true},\n" +
                "        {\"platform\": \"GitHub\", \"username\": \"sahil-code\", \"connected\": true},\n" +
                "        {\"platform\": \"Twitter\", \"username\": \"@sahilshaikh\", \"connected\": false}\n" +
                "      ]\n" +
                "    },\n" +
                "    \"contact\": {\n" +
                "      \"phone\": \"+91-9876543210\",\n" +
                "      \"addresses\": [\n" +
                "        {\n" +
                "          \"type\": \"home\",\n" +
                "          \"street\": \"MG Road\",\n" +
                "          \"city\": \"Pune\",\n" +
                "          \"state\": \"Maharashtra\",\n" +
                "          \"zip\": \"411001\",\n" +
                "          \"coordinates\": {\"lat\": 18.5204, \"long\": 73.8567}\n" +
                "        },\n" +
                "        {\n" +
                "          \"type\": \"office\",\n" +
                "          \"street\": \"Bandra Kurla Complex\",\n" +
                "          \"city\": \"Mumbai\",\n" +
                "          \"state\": \"Maharashtra\",\n" +
                "          \"zip\": \"400051\",\n" +
                "          \"coordinates\": {\"lat\": 19.0622, \"long\": 72.8810}\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  },\n" +
                "  \"accounts\": [\n" +
                "    {\n" +
                "      \"accountId\": \"ACC1001\",\n" +
                "      \"type\": \"Savings\",\n" +
                "      \"balance\": 50000.75,\n" +
                "      \"transactions\": [\n" +
                "        {\"txnId\": \"TXN001\", \"amount\": 1500.00, \"status\": \"Success\", \"date\": \"2025-10-07\"},\n" +
                "        {\"txnId\": \"TXN002\", \"amount\": 2000.50, \"status\": \"Pending\", \"date\": \"2025-10-06\"}\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"accountId\": \"ACC1002\",\n" +
                "      \"type\": \"Current\",\n" +
                "      \"balance\": 125000.25,\n" +
                "      \"transactions\": [\n" +
                "        {\"txnId\": \"TXN003\", \"amount\": 3500.00, \"status\": \"Success\", \"date\": \"2025-10-05\"},\n" +
                "        {\"txnId\": \"TXN004\", \"amount\": 4500.00, \"status\": \"Failed\", \"date\": \"2025-10-04\"}\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"orders\": [\n" +
                "    {\n" +
                "      \"orderId\": \"ORD1001\",\n" +
                "      \"date\": \"2025-09-30T14:25:00Z\",\n" +
                "      \"status\": \"Delivered\",\n" +
                "      \"items\": [\n" +
                "        {\"productId\": \"P001\", \"name\": \"Laptop\", \"quantity\": 1, \"price\": 75000.00},\n" +
                "        {\"productId\": \"P002\", \"name\": \"Wireless Mouse\", \"quantity\": 2, \"price\": 1500.50}\n" +
                "      ],\n" +
                "      \"shippingAddress\": {\n" +
                "        \"street\": \"MG Road\",\n" +
                "        \"city\": \"Pune\",\n" +
                "        \"state\": \"Maharashtra\",\n" +
                "        \"zip\": \"411001\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"orderId\": \"ORD1002\",\n" +
                "      \"date\": \"2025-10-05T10:10:00Z\",\n" +
                "      \"status\": \"Processing\",\n" +
                "      \"items\": [\n" +
                "        {\"productId\": \"P003\", \"name\": \"Smartphone\", \"quantity\": 1, \"price\": 30000.00}\n" +
                "      ],\n" +
                "      \"shippingAddress\": {\n" +
                "        \"street\": \"Bandra Kurla Complex\",\n" +
                "        \"city\": \"Mumbai\",\n" +
                "        \"state\": \"Maharashtra\",\n" +
                "        \"zip\": \"400051\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"settings\": {\n" +
                "    \"theme\": \"dark\",\n" +
                "    \"privacy\": {\n" +
                "      \"profileVisible\": true,\n" +
                "      \"showEmail\": false,\n" +
                "      \"showPhone\": false\n" +
                "    },\n" +
                "    \"security\": {\n" +
                "      \"2FA\": true,\n" +
                "      \"lastPasswordChange\": \"2025-08-01T12:00:00Z\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"notifications\": [\n" +
                "    {\"id\": \"N001\", \"type\": \"message\", \"message\": \"Welcome to our platform!\", \"read\": true, \"date\": \"2025-10-01T10:00:00Z\"},\n" +
                "    {\"id\": \"N002\", \"type\": \"alert\", \"message\": \"Your payment is pending.\", \"read\": false, \"date\": \"2025-10-06T15:30:00Z\"}\n" +
                "  ],\n" +
                "  \"roles\": [\"admin\", \"editor\", \"approver\"],\n" +
                "  \"isActive\": true,\n" +
                "  \"createdDate\": \"2025-10-01T10:30:00Z\"\n" +
                "}\n";
    }

}
