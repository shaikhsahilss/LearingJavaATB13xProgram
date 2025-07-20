package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("sahil");
// append method is used
        stringBuffer.append(" shaikh");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        // for Stringe
        // concetenations
        String name = "shaikh";
        name = name.concat("  Sahil");
        System.out.println(name);

        String s1 = "shaikh ";
        String  s2 = " sahil";

        String s3 = s1 + s2;
        System.out.println(s3);
    }
}
