package Hash_map;

import java.util.HashMap;

public class Longest_Subarray_with_Sum_Divisible_By_K {
    public static int longestSubarrayDivK(int[] arr, int k){ // [Naive Approach] Using loop- Iterating over all subarrays
        int res = 0;
        for (int i=0; i< arr.length; i++){
            int sum = 0;
            for (int j=i; j< arr.length; j++){
                // Add the current element to the subarray sum
                sum = (sum + arr[j]) % k;

                // Update max length if sum is divisible by k
                if (sum == 0)
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    public static int longSubarrDivK(int[] arr, int k){ // [E.A.] Using Prefix Sum modulo k
        int res = 0, n = arr.length;
        HashMap<Integer,Integer> prefIdx= new HashMap<>();
        int sum = 0;

        for (int i=0; i<n; i++){
            sum = ((sum + arr[i]) % k + k) % k;

            if (sum == 0)
                res = i + 1;
            // Update max length for repeating sum
            else if (prefIdx.containsKey(sum)){
                res = Math.max(res, i - prefIdx.get(sum));
            }
            // Store the first occurrence of sum
            else {
                prefIdx.put(sum,i);
            }
        }
        return res;
    }
    static void main() {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        System.out.println(longestSubarrayDivK(arr,k));
        System.out.println(longSubarrDivK(arr,k));
    }
}
