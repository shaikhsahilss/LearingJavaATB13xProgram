package ex_13_functions;

import java.util.Scanner;

public class Lab134_functions_arth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1");

        int a = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        } else {
            System.out.println("Enter the int only");

            System.exit(0);
        }
        System.out.println("Enter the num 2");
        int b =0;
        if (sc.hasNextInt())
        {
            b = sc.nextInt();
        }
        else {
            System.out.println("Enter the int only");

            System.exit(0);
        }

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);
        System.out.println(result_sum);
        System.out.println(result_div);
        System.out.println(result_mod);
        System.out.println(result_mul);
        System.out.println(result_sub);

    }
    static int sum(int a , int b)
    {
        return a+b;
    }
    static int mul(int a , int b)
    {
        return a*b;
    }
    static int div(int a , int b)
    {
        return a/b;
    }static int sub(int a , int b)
    {
        return a-b;
    }static int mod(int a , int b)
    {
        return a%b;
    }

}
