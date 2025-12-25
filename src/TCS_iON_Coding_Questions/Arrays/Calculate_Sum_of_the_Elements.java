package TCS_iON_Coding_Questions.Arrays;

public class Calculate_Sum_of_the_Elements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 5;
        int ans = 0;
        for (int i=0; i<n; i++){
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
