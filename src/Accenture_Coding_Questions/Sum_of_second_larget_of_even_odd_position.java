package Accenture_Coding_Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Sum_of_second_larget_of_even_odd_position {
    public static int largeSmallSum(int[] arr, int n){
        if (n < 3)
            return 0;

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);

        for (int i=1; i<n; i++){
            if (i % 2 == 0){
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size()-2) + odd.get(odd.size()-2);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,8,7};
        int n = 5;
        System.out.println(largeSmallSum( arr,n));
    }
}
