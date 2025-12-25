package Cognizant_Coding_Questions.Array;

public class Count_smaller_elements_on_right_side {
    void constructLowerArray(int arr[], int countSmaller[], int n) {
        int i, j;

        for (i = 0; i < n; i++)
            countSmaller[i] = 0;

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    countSmaller[i]++;
            }
        }
    }
        void printArray (int[] arr, int size){
            int i;
            for (i = 0; i < size; i++)
                System.out.print(arr[i] + " ");

            System.out.println("");
    }
    public static void main(String[] args) {
        Count_smaller_elements_on_right_side small = new Count_smaller_elements_on_right_side();
        int arr[] = { 12, 1, 2, 3, 0, 11, 4 };
        int n = arr.length;
        int low[] = new int[n];
        small.constructLowerArray(arr, low, n);
        small.printArray(low, n);
    }
}
