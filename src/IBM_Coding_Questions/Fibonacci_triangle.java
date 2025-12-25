package IBM_Coding_Questions;

import java.util.Scanner;

public class Fibonacci_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, n;

        System.out.print("Enter the limit: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            a = 0;
            b = 1;
            System.out.print(b + "\t");
            for (int j = 1; j < i; j++) {
                c = a + b;
                System.out.print(c + "\t");
                a = b;
                b = c;
            }
            System.out.println();
        }

        scanner.close();
    }
}
