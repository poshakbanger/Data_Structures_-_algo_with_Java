package Hash_map;

import java.util.Arrays;

public class Missing_elements_from_given_range {
    public static void findMissing(int arr[], int n, int low, int high){ // Naive Approach - O(n^2) Time and O(1) Space
        for (int i=low; i<high; i++){
            boolean found = false;
            for (int j=0; j<arr.length; j++){
                if (arr[j] == i){
                    found = false;
                    break;
                }
            }
            // If i is not found in the array, print it
            if (!found){
                System.out.print(i + " ");
            }
        }
    }

    public static void printMissing(int arr[], int low, int high){
        Arrays.sort(arr);

        int index = ceilindex(arr, low, 0, arr.length - 1);
        int x = low;

        while (index < arr.length && x <= high){
            if (arr[index] != x){
                System.out.print(x + " ");
            } else {
                index++;
                x++;
            }
            while (x <= high){
                System.out.print(x + " ");
                x++;
            }
        }
    }

    static int ceilindex(int arr[], int val, int low, int high){

        if (val < arr[0])
            return 0;
        if (val > arr[arr.length - 1])
            return arr  .length;

        int mid = (low + high) / 2;
        if (arr[mid] == val) return mid;
        if (arr[mid] < val){
            if (mid + 1 < high && arr[mid + 1] >= val)
                return mid + 1;
            return ceilindex(arr, val, mid + 1, high);
        }
        else {
            if (mid - 1 >= low && arr[mid - 1] < val)
                return mid;
            return ceilindex(arr, val, low, mid - 1);
        }
    }

    static void main() {

        int[] arr = { 1, 3, 5, 4 };
        int n = arr.length;
        int low = 1, high = 10;

        findMissing(arr, n, low, high);
        System.out.println();
        printMissing(arr,low,high);
    }
}
