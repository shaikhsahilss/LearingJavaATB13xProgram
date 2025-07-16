package ex_08_if_conditiond;

public class Lab081_if_p1 {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        if(age > 18){
            System.out.println("yes you can go to the goa!!");
        }
        else {
            System.out.println("You cannot go to Goa!!");
        }
    }
}
