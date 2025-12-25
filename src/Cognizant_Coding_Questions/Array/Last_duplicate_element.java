package Cognizant_Coding_Questions.Array;

import java.util.HashSet;

public class Last_duplicate_element {
    public static int[] duplicateElement(int arr[], int n){
        HashSet<Integer> seen = new HashSet<>();
        int lastDuplicate = -1;
        int lastIndex = -1;

        for (int i=0; i<n; i++){
            if (seen.contains(arr[i])){
                lastDuplicate = arr[i];
                lastIndex = i;
            } else {
                seen.add(arr[i]);
            }
        }

        return new int[]{lastDuplicate,lastIndex};
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 6, 6, 7};
        int n = arr.length;

        int[] result = duplicateElement(arr, n);
        if (result[0] != -1) {
            System.out.println("Last duplicate element: " + result[0] + " at index: " + result[1]);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
