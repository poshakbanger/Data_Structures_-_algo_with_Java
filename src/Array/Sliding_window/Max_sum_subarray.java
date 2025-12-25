package Array.Sliding_window;

public class Max_sum_subarray {
    public static int maxSumSubarray(int[] arr, int k){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // first window
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        max = sum;

        // slide window
        for(int i=k; i<n; i++){
            sum = sum + arr[i] - arr[i-k];   // add next, remove previous
            max = Math.max(max,sum);
        }
        return max;
    }
        public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int n = 6;
        int k = 3;
        int ans = maxSumSubarray(arr,k);
        System.out.println(ans);
    }
}
