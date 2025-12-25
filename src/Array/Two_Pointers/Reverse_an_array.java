package Array.Two_Pointers;

import java.util.Arrays;

public class Reverse_an_array {
    public static void reverse(int[] arr){
        int left = 0, right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        // Call reverse function
        reverse(arr);

        System.out.println("Reversed Array:");
        System.out.println(Arrays.toString(arr));
    }
}
