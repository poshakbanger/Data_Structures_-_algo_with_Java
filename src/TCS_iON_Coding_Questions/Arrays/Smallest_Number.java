package TCS_iON_Coding_Questions.Arrays;

public class Smallest_Number {
    public static void main(String[] args) {
        int arr[] = { 111, 13, 25, 9, 34, 1 };
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;

        for (int i=0; i<n; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is: "
                + smallest);
    }
}
