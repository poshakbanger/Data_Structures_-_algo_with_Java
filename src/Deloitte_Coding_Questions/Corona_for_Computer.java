package Deloitte_Coding_Questions;
import java.util.Scanner;
// right shift operation
public class Corona_for_Computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i: arr){
            System.out.print((i >> k)+ " ");
        }
        sc.close();
    }
}
