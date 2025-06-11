package ex_03_literals;

public class Lab034_char_literals

{

    public static void main(String[] args) {
        char c1 = 'A';
        char c2 ='B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';

        char c6 = '1';
        char c7 = '(';

        //Escape Char

        char new_line = '\n';
        char new_tab = '\t';
        char back_space = '\b';
        char carriage_return = '\r';


        System.out.println("sahilshaikh");
        System.out.println("sahil"+new_line+"shaikh");
        System.out.println("sahil"+new_tab+"shaikh");
        System.out.println("sahil"+back_space+"shaikh");

        System.out.println("sahil is old"+carriage_return+"shaikh");

        char c10 = 'A';

        char c11 = '\u1F10';


    }
}
