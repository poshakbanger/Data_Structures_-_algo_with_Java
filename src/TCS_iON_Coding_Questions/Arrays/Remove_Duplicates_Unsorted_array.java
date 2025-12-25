package TCS_iON_Coding_Questions.Arrays;

import java.util.HashMap;

public class Remove_Duplicates_Unsorted_array {
    static void duplicate(int arr[], int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0; i<n; i++){
            if (!mp.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                mp.put(arr[i],1);
            }
        }
    }
    public static void main(String[] args) {
        int n = 9;
        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        duplicate(arr, n);
    }
}
