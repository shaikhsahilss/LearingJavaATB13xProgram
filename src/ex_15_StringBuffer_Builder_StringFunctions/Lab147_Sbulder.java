package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab147_Sbulder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" word"); // append text
        sb.reverse();
        System.out.println(sb);
    }
}
