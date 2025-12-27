package Hash_map;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Minimum_Subsets_with_Distinct_Elements {
    public static int minSubsets(int[] arr){ // [N.S.] - Nested Loops - O(n^2) Time and O(1) Space
        int n = arr.length, maxCount = 0, res = arr[0];

        for (int i=0; i<n; i++){
            int count = 0;
            for (int j=0; j<n; j++){
                if (arr[i] == arr[j]) count++;
            }

            if (count > maxCount){
                maxCount = count;
                res = arr[i];
            }
        }
        return res;
    }

    public static int min_Subsets(int[] arr){ // [B.A.] - Using Sorting - O(n Log n) Time and O(1) Space
        Arrays.sort(arr);

        int max_count = 1, res = arr[0], curr_count = 1;
        for (int i=1; i< arr.length; i++){
            if (arr[i] == arr[i-1])
                curr_count++;
            else curr_count = 1;

            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr[i - 1];
            }
        }
        return res;
    }

    public static int minSub_sets(int[] arr){
        int n = arr.length;
        // Insert all elements in hash
        Map<Integer,Integer> hp = new HashMap<Integer,Integer>();

        for (int i=0; i<n; i++){
            int key = arr[i];
            if (hp.containsKey(key)){
                int freq = hp.get(key);
                freq++;
                hp.put(key,freq);
            } else {
                hp.put(key,1);
            }
        }

        // find max freq
        int max_count = 0, res = -1;

        for (Entry<Integer,Integer> val : hp.entrySet()){
            if (max_count < val.getValue()){
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        return res;
    }

    static void main() {
        int[] arr = {40, 50, 30, 40, 50, 30, 30};
        System.out.println(minSubsets(arr));
        System.out.println(min_Subsets(arr));
        System.out.println(minSub_sets(arr));
    }
}
