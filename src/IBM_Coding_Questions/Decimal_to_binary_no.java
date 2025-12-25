package IBM_Coding_Questions;
import java.util.Scanner;

public class Decimal_to_binary_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int n, i;

        System.out.print("Enter the number to convert: ");
        n = scanner.nextInt();

        // Conversion logic
        i = 0;
        while (n > 0) {
            a[i] = n % 2;
            n = n / 2;
            i++;
        }

        System.out.print("Binary of the given number = ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }

        scanner.close();
    }
}
