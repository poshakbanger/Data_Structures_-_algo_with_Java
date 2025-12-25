package Array.Sliding_window;

import java.util.HashMap;

public class Fruit_into_Baskets {
    public static int totalFruit(int[] fruits){
        int n = fruits.length;

        HashMap<Integer,Integer> fruitMap = new HashMap<>();

        int left = 0, right = 0, count = 0;

        while (right < n){
            fruitMap.put(fruits[right], fruitMap.getOrDefault(fruits[right],0) + 1);

            if (fruitMap.size() > 2){
                fruitMap.put(fruits[left], fruitMap.get(fruits[left]) -1);
                if(fruitMap.get(fruits[left]) == 0){
                    fruitMap.remove(fruits[left]);
                }
                left++;
            }
            count = Math.max(count, right-left+1);
            right++;
        }
        return count;
    }
}
