package Cognizant_Coding_Questions;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        while (n>0){
            int r = n % 10;
            sum = sum * 10 + r;
            n = n/10;
        }
        System.out.println("Reverse of Number is:-" +sum);
    }
}
