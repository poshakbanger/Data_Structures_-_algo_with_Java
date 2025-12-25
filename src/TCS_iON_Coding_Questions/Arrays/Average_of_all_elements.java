package TCS_iON_Coding_Questions.Arrays;

public class Average_of_all_elements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 5;
        int sum = 0;
        int ans = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
            ans = sum/2;
        }
        System.out.println(ans);
    }
}
