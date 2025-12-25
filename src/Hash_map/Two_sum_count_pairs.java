package Hash_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum_count_pairs {
    public static int countPairs(int[] arr, int target){
        int n = arr.length;
        int cnt = 0;

        for (int i=0; i< n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] + arr[j] == target)
                    cnt++;
            }
        }
        return cnt;
    }

    public static int cntPairs(int[] arr, int target){ // [Better Approach] Using Two Pointers Technique - O(nlogn) Time and O(1) Space
        int res = 0;
        int n = arr.length;
        int left = 0, right = n-1;

        Arrays.sort(arr);

        while (left < right){
            if (arr[left] + arr[right] < target)
                left++;
            else if (arr[left] + arr[right] > target)
                right--;
            // if sum is equal to target
            else {
                int cnt1 = 0, cnt2 = 0;
                int ele1 = arr[left], ele2 = arr[right];

                // count frequency of first element
                while (left < right && arr[left] == ele1){
                    cnt1++;
                    left++;
                }

                // Count frequency of second element
                while (left < right && arr[right] == ele2){
                    cnt2++;
                    right--;
                }
                // If both elements are same
                if (ele1 == ele2){
                    res += (cnt1 * (cnt1 - 1)) / 2;
                } else {
                    res += cnt1 * cnt2;
                }
            }
        }
        return res;
    }

    public static int count_Pairs(int[] arr, int target){ // [Expected Approach] Using Hash Map or Dictionary - O(n) Time and O(n) Space
        Map<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;

        for (int i=0; i<arr.length; i++){
            if (freq.containsKey(target - arr[i])){
                cnt += freq.get(target - arr[i]);
            }
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        return cnt;
    }

    static void main() {
        int[] arr = { 1, 5, 7, -1, 5 };
        int target = 6;
        System.out.println(countPairs(arr, target));
        System.out.println(cntPairs(arr,target));
        System.out.println(count_Pairs(arr,target));
    }
}
