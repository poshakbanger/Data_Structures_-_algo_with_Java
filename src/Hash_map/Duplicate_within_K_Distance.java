package Hash_map;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_within_K_Distance {
    public static boolean checkDuplicatesWithinK(int[] arr, int k) { // [Naive Approach] - O(n * k) Time and O(1) Space
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // traverse next k elements
            for (int c = 1; c <= k && (i+c) < n ; c++) {
                int j = i+c;

                // if find one more occurrence within k
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean check_Duplicates_Within_K(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) return true;
            set.add(arr[i]);
            // remove the "k+1" distant item Because:
            //
            //Elements older than k distance should not be checked
            //
            //We only care about last k elements
            //
            //This is called a sliding window.
            if (i >= k)
                set.remove(arr[i-k]);
        }
        return false;
    }
    static void main(String[] args) {
//        int[] arr = {10, 5, 3, 4, 3, 5, 6};
//        System.out.println(checkDuplicatesWithinK(arr, 3) ? "Yes" : "No");

        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (check_Duplicates_Within_K(arr, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
