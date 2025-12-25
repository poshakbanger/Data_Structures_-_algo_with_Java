package Virtusa_Coding_Questions;

public class Playing_with_Number {
    public static int[] shiftArray(int n, int arr[], int k){
        int ans[] = new int[n];
        int j=0;
        for (int i = k; i< arr.length; i++){
            ans[j++] = arr[i];
        }
        for (int i=0; i< k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;

    }
}
