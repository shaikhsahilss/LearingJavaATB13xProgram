package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_vs_Buffer {
    public static void main(String[] args) {

        String s0 = "Sahil";

        String s1 = new String("Sahil");

        StringBuffer stringBuffer = new StringBuffer("Sahil");
        // synchronized

        StringBuilder stringBuilder = new StringBuilder("Sahil");

        System.out.println(s0);
        System.out.println(s1);

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
