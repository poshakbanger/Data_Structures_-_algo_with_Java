package TCS_iON_Coding_Questions.Arrays;

public class Circular_rotation_of_an_array_by_K_positions {
    public static void rotate(int arr[], int d, int n){
        int p = 1;
        while (p <= d){
            int last = arr[0];
            for (int i=0; i< n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = last;
            p++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to left rotate array elements by d positions
    public static void leftRotate(int arr[], int d) {
        int n = arr.length;
        // To handle case when d >= n
        d = d % n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);
        // Reverse the remaining elements
        reverse(arr, d, n - 1);
        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            // swapping of two numbers
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
//        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//        int N = arr.length;
//        // Rotate 2 times
//        int d = 2;
//        rotate(arr, d, N);
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        leftRotate(arr, d);
        System.out.println("Array after left rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
