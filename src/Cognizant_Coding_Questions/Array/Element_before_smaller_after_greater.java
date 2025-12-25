package Cognizant_Coding_Questions.Array;

public class Element_before_smaller_after_greater {
    public static int findElement(int[] arr){
        int n = arr.length;

        int[] leftMax = new int[n];
        leftMax[0] = arr[0];

        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);

        int[] rightMin = new int[n];
        rightMin[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--)
            rightMin[i] = Math.min(rightMin[i + 1], arr[i]);

        // Check if we found a required element
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= leftMax[i] && arr[i] <= rightMin[i]) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.println(findElement(arr));
    }
}