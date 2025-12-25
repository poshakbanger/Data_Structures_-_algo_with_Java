package TCS_iON_Coding_Questions.Arrays;

public class Second_smallest_and_largest_number {
    public static void main(String[] args) {
        int arr[] = { 111, 13, 25, 9, 34, 1 };
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;


        for (int i=0; i<n; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is: "
                + smallest);

        for (int i = 0; i < n; i++) {
            if (arr[i] < second_smallest
                    && arr[i] > smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("second smallest element is: "
                + second_smallest);

        for (int i=0; i<n; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("smallest element is: "
                + largest);

        for (int i = 0; i < n; i++) {
            if (arr[i] > second_largest
                    && arr[i] < largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("second largest element is: "
                + second_largest);

    }
}
