package Cognizant_Coding_Questions.Array;

public class Count_Zeros {
    public static int zeros(int arr[]){
        int n = arr.length;
        int count = 0;
        for (int i=0; i<n; i++){
            if (arr[i] == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,0,5,6,0,0};
        System.out.println(zeros(arr));
    }
}
