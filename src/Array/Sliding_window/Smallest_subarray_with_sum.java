package Array.Sliding_window;

public class Smallest_subarray_with_sum {
    public int minSubArrayLen(int arr[], int target){
        int start = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for (int end = 0; end< arr.length; end++){
            sum += arr[end];

            while (sum >= target){
                minLen = Math.min(minLen, end - start +1);
                sum -= arr[start];
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    static void main(String[] args) {

    }
}
