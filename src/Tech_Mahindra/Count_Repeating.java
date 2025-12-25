package Tech_Mahindra;

import java.util.HashMap;
import java.util.Map;

public class Count_Repeating {
    public static int count_repeating(int data) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;

        while (data > 0) {
            int current_num = data % 10;
            if (mp.containsKey(current_num)) {
                mp.put(current_num, mp.get(current_num) + 1);
            } else {
                mp.put(current_num, 1);
            }
            data = data / 10;
        }

        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            if (m.getValue() > 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int testData = 122333; // Example test data
        System.out.println("Number of repeating digits: " + count_repeating(testData));
    }
}
