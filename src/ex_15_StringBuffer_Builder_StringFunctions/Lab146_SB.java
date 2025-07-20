package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_SB {
    public static void main(String[] args) {


        String name = "automation tesing selenium";

        String[] n1 = name.split(" ");

        String n2 = n1[1];
        StringBuffer stringBuffer = new StringBuffer(n2);
       String n4 = stringBuffer.reverse().toString();
        String all = n1[0] + " " + n4 +  " " + n1[2];
        System.out.println(all);

        StringBuilder stringBuilder = new StringBuilder("Sahil");

        stringBuilder.append(123);

        System.out.println(stringBuilder);
    }
}
