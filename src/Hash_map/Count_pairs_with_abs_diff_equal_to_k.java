package Hash_map;

import java.util.Arrays;
import java.util.HashMap;

public class Count_pairs_with_abs_diff_equal_to_k {
    public static int countPairs(int arr[], int k){ // [Naive Approach] Generating all pairs - O(n^2) Time and O(1) Space
        int cnt = 0;
        int n = arr.length;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (Math.abs(arr[i] - arr[j])== k)
                    cnt++;
            }
        }
        return cnt;
    }

    public static int count_Pairs(int arr[], int k){ // [Better Approach] Sorting and Two Pointer Technique - O(n*logn) Time and O(1) Space
        int n = arr.length;
        int cnt = 0;

        Arrays.sort(arr);
        int i =0, j =0;

        while (j < n){
            if (arr[j] - arr[i] < k)
                j++;

                // If difference is greater than k, decrease the
                // difference by moving i pointer towards right
            else if (arr[j] - arr[i] > k)
                i++;

                // If difference is equal to k, increase the difference
                // by moving j pointer towards right
            else {
                int ele1 = arr[i], ele2 = arr[j];
                int cnt1 = 0, cnt2 = 0;

                // Count frequency of first element of the pair
                while (j < n && arr[j] == ele2) {
                    j++;
                    cnt2++;
                }
                // Count frequency of second element of the pair
                while (i < n && arr[i] == ele1) {
                    i++;
                    cnt1++;
                }
                // If both the elements are same, then count of
                // pairs = the number of ways to choose 2
                // elements among cnt1 elements
                if (ele1 == ele2)
                    cnt += (cnt1 * (cnt1 - 1)) / 2;
                    // If the elements are different, then count of
                    // pairs = product of the count of both elements
                else
                    cnt += (cnt1 * cnt2);
            }
        }
        return cnt;
    }

    public static int cnt_Pairs(int arr[], int k){
        int n = arr.length;
        int cnt = 0;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int i=0; i< n; i++){
            if (freq.containsKey(arr[i] + k))
                cnt += freq.get(arr[i] + k);

            if (freq.containsKey(arr[i] - k))
                cnt += freq.get(arr[i] - k);

            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        return cnt;
    }
    static void main() {
        int arr[] = {1, 4, 1, 4, 5};
        int k = 3;
        System.out.println(countPairs(arr,k));
        System.out.println(count_Pairs(arr,k));
        System.out.println(cnt_Pairs(arr,k));
    }
}
