package Hash_map;

import java.util.HashMap;

public class Max_Distance_Between_Two_Occurrences {
    public static int maxDistance(int[] arr){ // [Naive Approach] Exploring all pairs - O(n^2) Time and O(1) Space
        int res = 0;
        for (int i=0; i< arr.length-1; i++){
            for (int j =i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    res = Math.max(res, j-i);
                }
            }
        }
        return res;
    }

    public static int maxDis(int[] arr){ // [Expected Approach] Using Hash Map or Dictionary
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;

        for (int i=0; i< arr.length; i++){
            if (!map.containsKey(arr[i]))
                map.put(arr[i], i);
            else res = Math.max(res, i - map.get(arr[i]));
        }
        return res;
    }
    static void main() {
        int[] arr = {1, 2, 4, 1, 3, 4, 2, 5, 6, 5};
        //System.out.println(maxDistance(arr));
        System.out.println(maxDis(arr));
    }
}
