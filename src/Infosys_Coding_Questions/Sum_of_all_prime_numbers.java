package Infosys_Coding_Questions;

import java.util.Scanner;

public class Sum_of_all_prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // Loop from 2 to n (1 is not prime)
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sum);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
