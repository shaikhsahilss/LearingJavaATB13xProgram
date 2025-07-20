package ex_13_functions;

public class Lab132_UD_p1 {
    public static void main(String[] args) {

        wp();
        Greet();
        greet_with("sahil", 27, 10.1);
        int sum =sum_ofTwo(5,10);
        System.out.println(sum);
    }
    // Type 1- without paratmert without return type
    static  void wp(){
        System.out.println("Tyep - without paratmeter without return type");
        System.out.println("Hi, How are you");
    }
    // Type 2 - without parameter with return type
    static String Greet(){
        System.out.println("Type - without paratmeter but return type");
        System.out.println("Wp with RT");
        return "Hi, are you";

    }
    //  type 3 - with parameter without return type
    static void greet_with(String name, int age, double salary){

        System.out.println("Your name is "+ name +" and" + age + "and" + salary);

    }
    // Type 4 - with parameter with return type
    static int sum_ofTwo(int a , int b){
        return a+b;
    }

}
