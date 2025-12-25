package Hash_map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subset_or_not {
    public static boolean isSubset(int[] a, int[] b) {  // naive approach
        int m = a.length, n = b.length;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    a[j] = -1; // mark as visited
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    public static boolean issubset(int[] a, int[] b){  // [Better Approach] Using Sorting and Two Pointer
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0, j = 0;
        int m = a.length, n = b.length;

        while (i < m && j < n){
            if (a[i] < b [j])
                i++;   // move in "a" to catch up
            else if (a[i] == b[j]) {
                i++;
                j++;
            }
            else {
               // a[i] > b[j] ->  means b[j] is missing
                return false;
            }
        }
        return (j == n); // all b[] matched
    }

    public static boolean issubSet(int[] a, int[] b){ // [Expected Approach] Using Hashing- O(m + n) Time and O(m) Space
        Set<Integer> hashSet = new HashSet<>();
        for (int num : a){
            hashSet.add(num);
        }

        for (int num : b){
            if (!hashSet.contains(num)){
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
//        int[] a = {11, 1, 13, 21, 3, 7};
//        int[] b = {11, 3, 7, 1};
//
//        if (isSubset(a, b)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

//        int[] a = {11, 1, 13, 21, 3, 7};
//        int[] b = {11, 3, 7, 1};
//
//        if (issubset(a, b)) System.out.println("true");
//        else System.out.println("false");

        int[] a = { 11, 1, 13, 21, 3, 7 };
        int[] b = { 11, 3, 7, 1 };

        if (isSubset(a, b)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
