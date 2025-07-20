package ex_16_arrays;

public class Lab164_Left_tringe {
    public static void main(String[] args) {

        int n =10;
        for(int i = 0; i < n ; i++){
            for(int j = 10 ; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            for(int m = 2; m < i; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
