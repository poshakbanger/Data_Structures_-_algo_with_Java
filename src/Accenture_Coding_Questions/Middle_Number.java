package Accenture_Coding_Questions;

public class Middle_Number {
    public static int helper(int[] arr, int n){
        int count = 0;

        for (int i=0; i<n; i++){
            if (arr[i] > 0){
                count++;
            }
        }
        int mid_element = (count + 1)/2;
        for (int i=0; i<n; i++){
            if (arr[i] > 0){
                mid_element--;
                if (mid_element == 0)
                    return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 6;
        int [] arr = {1,-2,3,-4,5,6};

        for (int i=0; i<n; i++){
            System.out.println();
        }
        System.out.println(helper(arr,n));
    }
}