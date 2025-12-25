package Accenture_Coding_Questions;
// kaden`s algorithm
public class Subarray_Largest_Sum {
    public static int maxSubarray(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
             sum += nums[i];
             max = Math.max(max,sum);
             if (sum < 0){
                 sum = 0;
             }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2,5,7,-1,4};
        System.out.println(maxSubarray(nums));
    }
}
