package ex_10_loop;

public class Lab113_for_Continue {
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++){
            if( i == 5){
                continue; //skip the code and move to the next to top
            }
            System.out.println(i);
        }
    }
}
