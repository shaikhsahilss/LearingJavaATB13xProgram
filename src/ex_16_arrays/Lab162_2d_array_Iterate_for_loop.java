package ex_16_arrays;

public class Lab162_2d_array_Iterate_for_loop {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }

        for(int [] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
