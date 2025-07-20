package ex_16_arrays;

public class Lab165_Array_Copy {
    public static void main(String[] args) {
        int [] orignal = {1,2,3};
        int [] copy = new int[orignal.length];
        System.arraycopy(orignal,0 ,copy, 0, orignal.length);
    }
}
