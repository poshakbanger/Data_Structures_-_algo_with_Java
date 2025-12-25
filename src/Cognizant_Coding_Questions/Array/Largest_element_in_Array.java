package Cognizant_Coding_Questions.Array;

public class Largest_element_in_Array {
    public static int findLargest(int arr[], int n){
        int maxVal = arr[0];
        for (int i= 1; i<n; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int arr[] = {34, 21, 4, 77, 18};
        int n = 5;
        int ans = findLargest(arr,n);
        System.out.println(ans);
    }
}
