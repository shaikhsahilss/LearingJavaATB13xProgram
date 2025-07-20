package ex_16_arrays;

public class Lab158_Arrays_Find_Element_Linear_search {
    public static void main(String[] args) {

        int [] a = {23,43,45,67,87,90};
        // find the target 67, give index?
        int target = 43;

        for(int i = 0; i < a.length; i++){
         if( target == a[i]){
             System.out.println(i);

         }
        }
    }
}
