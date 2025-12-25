package Array.Two_Pointers;

public class Pair_sum_in_sorted_array {
    public static boolean pairWithSum(int[] arr, int k){
        int left =0, right = arr.length -1;

        while (left < right){
            int sum = arr[left] + arr[right];

            if (sum == k) return true;
            else if (sum < k) left++;
            else right--;
        }
        return false;
    }
    static void main(String[] args) {
        int arr[] = {2,5,7,9,11};
        int k = 1;
        System.out.println(pairWithSum(arr,k));
    }
}
