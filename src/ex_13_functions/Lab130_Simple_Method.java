package ex_13_functions;

public class Lab130_Simple_Method {
    static  void sahil_f1(){
        System.out.println("No Return");
    }
    static  int return_int(){
        System.out.println("This is a noraml function which return something");
        System.out.println("This is a noraml function which return something");
        System.out.println("This is a noraml function which return something");
        System.out.println("This is a noraml function which return something");
return 10;
    }
    static boolean return_boolean(){
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }
    static long return_long(){
        return 101;
    }
    static String return_String(){
        return "Sahil";
    }

    public static void main(String[] args) {
        sahil_f1();
        return_boolean();
        return_String();
        return_String();
        return_int();
    }
}
