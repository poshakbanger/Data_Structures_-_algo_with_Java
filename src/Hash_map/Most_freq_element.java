package Hash_map;

import java.util.Arrays;
import java.util.HashMap;

public class Most_freq_element {
    public static int mostFreqElement(int[] arr){ // Nested Loops - O(n2) Time and O(1) Space
        int n = arr.length;
         int maxCount = 0;
         int res = 0;

        for (int i=0; i< n; i++){
            int count = 0;
            for (int j =0; j< n; j++){
                if (arr[i] == arr[j])
                    count++;
            }

            // If count is greater or if count is same but value is bigger.
            if (count > maxCount || (count == maxCount && arr[i] > res)){
                maxCount = count;
                res = arr[i];
            }
        }
        return res;
    }

    public static int mostFreqEle(int[] arr){ // [Better Approach] Using Sorting - O(n × log n) Time and O(1) Space
        Arrays.sort(arr);

        int maxCnt = 1, res = arr[0], currCnt = 1;
        for (int i=1; i < arr.length; i++){
            if (arr[i] == arr[i-1])
                currCnt++;
            else
                currCnt = 1;

            if (currCnt > maxCnt || (currCnt == maxCnt && arr[i] > res)) {
                maxCnt = currCnt;
                res = arr[i];
            }
        }
        return res;
    }

    public static int mostFreqNo(int[] arr) { // [Expected Approach] Using Hashing - O(n) Time and O(n) Space
        int n = arr.length;

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

            // find the max frequency
            int maxCnt = 0, res = -1;
            for (var entry : freq.entrySet()) {
                int val = entry.getKey(), cnt = entry.getValue();

                // update if frequency is higher or same but value is larger
                if (maxCnt < cnt || (cnt == maxCnt && val > res)) {
                    res = val;
                    maxCnt = cnt;
                }
            }
            return res;
        }
        return 0;
    }
    static void main(String[] args) {
        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        System.out.println(mostFreqElement(arr));
        System.out.println(mostFreqEle(arr));
        System.out.println(mostFreqNo(arr));
    }
}
