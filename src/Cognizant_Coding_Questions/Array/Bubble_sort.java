package Cognizant_Coding_Questions.Array;

public class Bubble_sort {
    static void bubbleSort(int[] arr){
        int n = arr.length;

        // outer loop for number of passes
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j+1]){
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
