package Accenture_Coding_Questions;

public class Missing_Number {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int total = (n)*(n-1)/2;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum += nums[i];
        }
        return total - sum;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int n = 3;

    }
}
