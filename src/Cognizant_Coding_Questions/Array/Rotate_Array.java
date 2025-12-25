package Cognizant_Coding_Questions.Array;

import java.util.Arrays;

public class Rotate_Array {
    public static void rotate(int[] nums, int k){
        int n = nums.length;

        // In case k > n
        k = k % n;

        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining n-k elements
        reverse(nums, k, n - 1);
        // Reverse whole array
        reverse(nums, 0, n-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end) {
            // Swap nums[start] and nums[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(arr));

        rotate(arr, k);

        System.out.println("Rotated array by " + k + " positions: " + Arrays.toString(arr));
    }
}
