package Cognizant_Coding_Questions.Array;

public class Sum_of_elements {
    public static int sum(int arr[], int n){
        int ans = 0;
        for (int i=0; i<n; i++){
            ans += arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr = {2,3,5,4};
        int n = 4;
        int sum_of_elements = sum(arr,n);
        System.out.println(sum_of_elements);
    }
}
