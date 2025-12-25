package Infosys_Coding_Questions;

import java.util.Arrays;
import java.util.Comparator;

public class Largest_no_of_digits {
    public static void main(String[] args) {
        Integer arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

        // Convert array to String for comparison
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String str1 = a + "" + b;
                String str2 = b + "" + a;
                return str2.compareTo(str1); // Sort in descending order
            }
        });

        // Build the largest number
        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            result.append(num);
        }

        System.out.println(result.toString());
    }
}
