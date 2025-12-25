package Deloitte_Coding_Questions;

import java.util.Scanner;

public class Odd_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int n = scanner.nextInt();

        int i = 1;

        // Loop to print the sequence
        while (n-- != 0) {
            System.out.print(i + " ");
            i += 2;
        }

        // Close the scanner
        scanner.close();
    }
}


