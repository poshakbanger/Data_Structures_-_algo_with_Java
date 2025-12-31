package Hash_map;

import java.util.HashMap;

public class Check_If_Array_Pair_Sums_Divisible_by_k {
    public static boolean canPairs(int[] arr, int k){ // N.A. - O(n^2) Time and O(n) Space
        int n = arr.length;
        if (n % 2 == 1) return false;

        int count = 0;

        boolean[] vis = new boolean[n];

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                // If pair is divisible increment the count and mark elements as visited
                if ((arr[i] + arr[j]) % k == 0 && !vis[i] && !vis[j]){
                    count++;
                    vis[i] = true;
                    vis[j] = true;
                }
            }
        }
        return (count == n / 2);
    }

    public static boolean can_Pairs(int[] arr, int k){
        if (arr.length % 2 == 1) return false;

        HashMap<Integer,Integer> hm = new HashMap<>();

        // Count occurrences of all remainders
        for (int i=0; i< arr.length; i++){
            int rem = ((arr[i] % k) + k) % k;
            if (!hm.containsKey(rem)){
                hm.put(rem,0);
            }
            hm.put(rem, hm.get(rem) + 1);
        }

        // Traverse input array and use freq[] to decide if given array can be divided in pairs
        for (int i=0; i < arr.length; i++){
            // Remiander of current element
            int rem = ((arr[i] % k) + k) % k;

            if (2 * rem == k){
                if (hm.get(rem) % 2 == 1) return false;
            } else if (rem == 0) {
                if (hm.get(rem) % 2 == 1)
                    return false;
            } else {
                if (hm.get(k - rem) != hm.get(rem))
                    return false;
            }
        }
        return true;
    }

    public static boolean checkCanPairs(int[] arr, int k){
        if (arr.length % 2 != 0)
            return false;

        // Create a frequency array of size k
        int[] freq = new int[k];

        for (int x : arr) {
            int rem = x % k;

            // If the complement of the current remainder exists in freq, decrement its count
            if (freq[(k - rem) % k] != 0)
                freq[(k - rem) % k]--;
            // Otherwise, increment the count of the current remainder
            else freq[rem]++;
        }

        for (int count : freq){
            if (count != 0)
                return false;
        }
        return true;
    }

    static void main() {
        int[] arr = {92, 75, 65, 48, 45, 35};
        int k = 10;
        System.out.println(canPairs(arr, k) ? "True" : "False");
        System.out.println(can_Pairs(arr, k) ? "True" : "False");
        System.out.println(checkCanPairs(arr, k) ? "True": "False");
    }
}
