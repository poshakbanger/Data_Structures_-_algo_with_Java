package Cognizant_Coding_Questions;

public class Binary_Search_Algo {
    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2; // avoids overflow

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                left = mid + 1;

            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {21, 34, 45, 56, 78};
        int target = 45;
        int ans =  BinarySearch(arr,target);
        System.out.println(ans);
    }
}
