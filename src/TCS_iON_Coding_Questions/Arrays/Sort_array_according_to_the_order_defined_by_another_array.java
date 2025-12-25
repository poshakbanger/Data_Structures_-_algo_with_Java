package TCS_iON_Coding_Questions.Arrays;

import java.util.*;

public class Sort_array_according_to_the_order_defined_by_another_array {
    public static void relativeSort(List<Integer> arr1, List<Integer> arr2){
        int m = arr1.size(), n = arr2.size();
        Map<Integer,Integer> freq = new HashMap<>();

        // Count frequency of each element in arr1
        for (int i=0; i<m; i++){
            freq.put(arr1.get(i), freq.getOrDefault(arr1.get(i),0)+1);
        }
        int index = 0;

        // Place elements of arr2 in arr1 based on frequency
        for (int i=0; i<n; i++){
            while (freq.getOrDefault(arr2.get(i),0)>0){
                arr1.set(index++,arr2.get(i));
                freq.put(arr2.get(i), freq.get(arr2.get(i)) - 1);
            }
            freq.remove(arr2.get(i));
        }
        // Collect remaining elements and sort them
        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            while (entry.getValue() > 0) {
                remaining.add(entry.getKey());
                entry.setValue(entry.getValue() - 1);
            }
        }
        Collections.sort(remaining);

        // Append remaining elements to arr1
        for (int i : remaining) {
            arr1.set(index++, i);
        }
    }

    public static void printArray(List<Integer> arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 1, 8, 3));

        relativeSort(arr1, arr2);

        printArray(arr1);
    }
}
