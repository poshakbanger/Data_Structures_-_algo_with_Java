package Accenture_Coding_Questions;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static int oddNo(int n){
        int ans = 0;
        int[] arr = {23, 6, 65, 80, 2};
        for (int i=0; i<n; i++){
            if (arr[i] % 2 == 1){
                ans += arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        System.out.println(oddNo(5));
    }
}
