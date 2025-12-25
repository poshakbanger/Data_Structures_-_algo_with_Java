package Deloitte_Coding_Questions;

public class SumOfEvenNumbers {
    public static int ans(int n) {
        int ans = 0;
        int arr[] = {10,47,30};

        for (int i=0; i<n; i++){
            if (arr[i] % 2 == 0){
                ans += arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ans(3));
    }
}
