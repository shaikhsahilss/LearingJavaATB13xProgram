package ex_10_loop;

public class Lab_for_loop_contine_Evevn_no {
    public static void main(String[] args) {
        for(int i = 0; i<=50; i++){
            if(i %2 ==0){
                continue;
            }
            System.out.println("Odd -> "+i);
        }
    }
}
