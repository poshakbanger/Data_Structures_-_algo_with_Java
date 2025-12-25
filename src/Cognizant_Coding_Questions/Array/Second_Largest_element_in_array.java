package Cognizant_Coding_Questions.Array;

import java.util.Arrays;

public class Second_Largest_element_in_array {
    public static int second_largest(int arr[], int n){
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i<n; i++){
            ans = arr[n-2];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 7, 6, 5};
        int n = 5;
        int sl = second_largest(arr,n);
        System.out.println(sl);
    }
}
