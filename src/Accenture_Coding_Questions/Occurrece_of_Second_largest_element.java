package Accenture_Coding_Questions;

public class Occurrece_of_Second_largest_element {
    public static int helper(int [] arr, int n){
        if (n == 0) return 0;
        int secondLargestElement = 0;
        for (int i=n-2;i>=0;i--){
            if (arr[i] != arr[i+1]){
                secondLargestElement = arr[i];
                break;
            }
        }
        int occurance = 0;

        for (int i=0; i<n; i++){
            if (arr[i] == secondLargestElement){
                occurance++;
            }
        }
        return occurance;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] arr = {1,2,3,4,5,6,6,7};
        System.out.println(helper(arr,n));
    }
}