package Cognizant_Coding_Questions.Array;

public class Buildings_facing_the_sun {
    public static int longest(int arr[]){
        int n = arr.length;
        if (n == 0) return 0;
        int ans = 1;
        int maxi = arr[0];

        for (int i=1; i<n; i++){
            if (arr[i] >= maxi){
                ans++;
                maxi = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {6, 2, 8, 4, 11, 13};
        System.out.println(longest(arr));
    }
}