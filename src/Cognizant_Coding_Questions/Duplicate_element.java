package Cognizant_Coding_Questions;

import java.util.HashSet;

public class Duplicate_element {
    public static int findDuplicate(int[] arr, int n){
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (seen.contains(arr[i]))
                return arr[i]; // duplicate found
            seen.add(arr[i]);  // add the current element to the set
        }
        return -1; // No duplicate found
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 3}; // Example array
        int n = arr.length;
        int duplicate = findDuplicate(arr, n);
        if (duplicate != -1)
            System.out.println("Duplicate element: " + duplicate);
        else
            System.out.println("No duplicate element found");
    }
}
