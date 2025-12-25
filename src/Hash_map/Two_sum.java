package Hash_map;

import java.util.Arrays;
import java.util.HashSet;

public class Two_sum {
    public static boolean sum(int[] arr) { // [Naive Approach]
        int n = arr.length;
        int target = -2;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }

    public static boolean twoSum(int[] arr, int target) { // [Better Approach 1] Sorting and Binary Search - O(n × log(n)) time and O(1) space
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (binarySearch(arr, i + 1, arr.length - 1, complement))
                return true;
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return true;
            if (arr[mid] < target) left = mid + 1;
            if (arr[mid] > target) right = mid - 1;
        }
        return false;
    }

    public static boolean twosum(int[] arr, int target) { // [Expected Approach] Using Hash Set - O(n) time and O(n) space
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement that added to arr[i], equals the target
            int complement = target - arr[i];

            // check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }
            set.add(arr[i]);
        }
        // add the current element to the set
        return false;
    }


    static void main() {
        int arr[] = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(sum(arr));
        System.out.println(twoSum(arr,target));
        System.out.println(twosum(arr,target));
    }
}
