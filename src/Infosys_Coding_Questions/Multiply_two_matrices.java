package Infosys_Coding_Questions;

public class Multiply_two_matrices {
    public static void main(String[] args) {

        // First matrix
        int[][] m1 = {{1, 1}, {2, 2}};

        // Second matrix
        int[][] m2 = {{1, 1}, {2, 2}};

        // Resultant matrix of size 2x2
        int[][] result = new int[2][2];

        // Matrix multiplication
        for (int i = 0; i < 2; i++) {           // Row of first matrix
            for (int j = 0; j < 2; j++) {       // Column of second matrix
                for (int k = 0; k < 2; k++) {   // Column of first matrix / Row of second matrix
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();

        }
    }
}