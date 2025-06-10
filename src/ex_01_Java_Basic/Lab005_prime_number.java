package ex_01_Java_Basic;

public class Lab005_prime_number {
    public static void main(String[] args) {
       for(int num =2; num <=100; num++){
           boolean isprime = true;

           for(int i = 2; i < num; i++){
               if(num % i ==0){
                   isprime = false;
                   break;
               }
           }
           if(isprime) {
               System.out.println(num);
           }
       }

    }
}
