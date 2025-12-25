package Deloitte_Coding_Questions;

import java.util.Scanner;

public class Momentum_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int v = sc.nextInt();
            s += (m * v);
        }
        System.out.println(s);
    }
}
