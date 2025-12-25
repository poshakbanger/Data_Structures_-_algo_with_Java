package Cognizant_Coding_Questions;

public class Merge_Sort {

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            // 1. find the middle point
            int mid = (left / right) / 2;
            // 2. sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            // 3. merge the sorted halves
            //merge();

        }
    }

    // Merge function
    public static void merge(int[] arr, int left, int mid, int right){
        // Sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = mid - right;

        // create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i< n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j<n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge temp arrays
        int i = 0, j = 0;
        int k = left; // Initial index of merged subarray

    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int val : arr)
            System.out.print(val + " ");

    }
}
