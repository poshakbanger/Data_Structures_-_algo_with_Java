package Cognizant_Coding_Questions;
import java.util.HashMap;

public class FindPairWithSum {
    public static int countPairs(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for (int num: nums){
            int complement = k - num;
            if (map.containsKey(complement)){
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        int k = 6;
        int result = countPairs(nums, k);
        System.out.println("Number of pairs with sum " + k + " is: " + result);
    }
}
