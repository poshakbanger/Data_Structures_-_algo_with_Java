package Tech_Mahindra;

import java.util.Scanner;

public class Significante_Bits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Input number

        int count = 0;
        int leastSignificant = -1;
        int mostSignificant = -1;
        int i = 0;

        while (n > 0) {
            if ((n & 1) == 1) {  // Check if the least significant bit is 1
                count++;
                if (leastSignificant == -1) leastSignificant = i;
                mostSignificant = i;
            }
            i++;
            n = n >> 1;  // Right shift the number by 1 bit
        }

        System.out.println(count + "#" + leastSignificant + "#" + mostSignificant);
    }
}

