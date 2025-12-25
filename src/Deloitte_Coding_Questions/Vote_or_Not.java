package Deloitte_Coding_Questions;
import java.util.Scanner;

public class Vote_or_Not {
    public static int Age(int n){
        if (n >= 18){
            System.out.println("Yes you can do vote");
        }
        else {
            System.out.println("You can do not vote");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Age(n));
    }
}
