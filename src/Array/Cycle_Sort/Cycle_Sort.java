package Array.Cycle_Sort;

import java.util.Arrays;

public class Cycle_Sort {
    public static void cyclicSort(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i < n){
            int correctIndex = n-1;

            if (arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    static void main(String[] args) {
        int[] nums = {3, 1, 5, 4, 2};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(nums));

        cyclicSort(nums);

        System.out.println("Sorted array using Cyclic Sort:");
        System.out.println(Arrays.toString(nums));
    }
}
