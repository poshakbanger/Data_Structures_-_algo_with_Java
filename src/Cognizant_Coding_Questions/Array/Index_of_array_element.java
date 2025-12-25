package Cognizant_Coding_Questions.Array;

public class Index_of_array_element {
    public static int element_index(int[] arr, int n, int num){
        for (int i=0; i<n; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,7,8};
        int n = 5;
        int num = 7;
        int ans = element_index(arr,5,7);
        System.out.println(ans);
    }
}