package Hash_map;

import java.util.Arrays;
import java.util.HashSet;

public class Missing_Element_of_a_Range {
    public static int missNumber(int arr[]){ // [N.A.] - Sorting - O(n Log n) Time and O(1) Space
        Arrays.sort(arr);
        int count = 0;

        for (int i=0; i < arr.length-1; i++)
            if (arr[i] != arr[i + 1] && arr[i] != arr[i + 1] - 1)
                count += arr[i + 1] - arr[i] - 1;
        return count;
    }

    public static int miss_Number(int[] arr){ // [E.A.] - Hashing - O(n) Time and O(n) Space
        HashSet<Integer> s = new HashSet<>();
        int count = 0, maxm = Integer.MIN_VALUE, minm = Integer.MAX_VALUE;

        for (int i=0; i < arr.length; i++){
            s.add(arr[i]);
            if (arr[i] < minm)
                minm = arr[i];
            if (arr[i] > maxm)
                maxm = arr[i];
        }
        // the missing element count
        return (maxm - minm + 1) - s.size();
    }
    static void main() {
        int []arr = { 3, 5, 8, 6 };
        System.out.println(missNumber(arr));
        System.out.println(miss_Number(arr));
    }
}
