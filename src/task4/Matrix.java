package task4;

public class Matrix {
    public static void main(String[] args) {

        int row1 = 3, col1 = 3;
        int row2 = 3, col2 = 2;

        int[][] matrix1 = {
                {1, 4, 3},
                {4, 5, 7},
                {0, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] result = new int[row1][col2];

        if (col1 != row2) {
            System.out.println("It is not possible to perform multiplication of matrices");
        } else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    result[i][j]=0;
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("The result of matrix multiplication:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
