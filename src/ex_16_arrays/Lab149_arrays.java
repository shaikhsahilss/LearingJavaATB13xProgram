package ex_16_arrays;

public class Lab149_arrays {
    public static void main(String[] args) {

        int a = 10;

        int [] marks ={ 91,90,51,100,91,92,89};

        int length = marks.length;
        System.out.println(length);
        int sum = 0;
        for(int b : marks){

            sum = sum + b;

        }
        System.out.println(sum);

        double avrage = sum/length;

        System.out.println(avrage);
    }
}
