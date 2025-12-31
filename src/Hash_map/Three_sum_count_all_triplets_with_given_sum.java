package Hash_map;

import java.util.HashMap;
import java.util.Map;

public class Three_sum_count_all_triplets_with_given_sum {
    public static int countTriplets(int[] arr, int target){ // [N.A.] Explore all Triplets – O(n^3) Time and O(1) Space
        int cnt = 0, n = arr.length;

        for (int i=0; i< n-2; i++){
            for (int j=i+1; j<n-1; j++){
                for (int k = j+1; k < n; k++){

                    if (arr[i] + arr[j] + arr[k] == target)
                        cnt++;
                }
            }
        }
        return cnt;
    }

    public static int getPairsCount(int[] arr, int idx, int target){ // [E.A.] Using Hash Set - O(n^2) Time and O(n) Space
        int cnt = 0;
        Map<Integer,Integer> freq = new HashMap<>();

        for (int i=idx; i< arr.length; i++){
            // Check if the complement (target - arr[i]) exists in the map. If yes, increment count
            if (freq.containsKey(target - arr[i])){
                cnt += freq.get(target - arr[i]);
            }
            // Increment the frequency of arr[i]
            freq.put(arr[i], freq.getOrDefault(arr[i],0) + 1);
        }
        return cnt;
    }

    public static int cntTriplets(int[] arr, int target){
        int cnt = 0;
        int n = arr.length;

        for (int i=0; i<n-2; i++){
            int rem = target - arr[i];
            cnt += getPairsCount(arr, i+1, rem);
        }
        return cnt;
    }
    static void main() {
        int arr[] = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(countTriplets(arr,target));
        System.out.println(cntTriplets(arr,target));
    }
}