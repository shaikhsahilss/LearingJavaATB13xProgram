package ex_16_arrays;

public class Lab158_String_CLI_ForEach_loop {
    public static void main(String[] sahil) {

        for(int i = 0; i <sahil.length; i++ ){
            System.out.println(sahil[i]);
        }
        System.out.println("--------");

        for (String arg : sahil){
            System.out.println(arg);
        }
    }
}
