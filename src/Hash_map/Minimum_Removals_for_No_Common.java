package Hash_map;
import java.util.HashMap;

public class Minimum_Removals_for_No_Common {
    public static int remove_min(int[] arr1, int arr2[]){ // Using Two Maps - O(n+m) Time and O(n+m) Space
        HashMap<Integer,Integer> countA = new HashMap<>();
        HashMap<Integer,Integer> countB = new HashMap<>();

        int res = 0;

        for (int num : arr1)
            countA.put(num, countA.getOrDefault(num,0) + 1);

        for (int num : arr2)
            countB.put(num, countB.getOrDefault(num,0) + 1);

        for (int key : countA.keySet()){
            if (countB.containsKey(key)){
                res += Math.min(countA.get(key), countB.get(key));
            }
        }
        return res;
    }

    public static int minRemove(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0;

        // count elements of arr1
        for (int num : arr1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (count.containsKey(num) && count.get(num) > 0){
                count.put(num, count.get(num) - 1);
            res++;
        }
    }
        return res;
    }
    static void main() {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {2, 3, 4, 5, 8};
        System.out.println(remove_min(arr1,arr2));
        System.out.println(minRemove(arr1,arr2));
    }
}
