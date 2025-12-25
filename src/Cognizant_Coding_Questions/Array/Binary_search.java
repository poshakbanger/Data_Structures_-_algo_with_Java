package Cognizant_Coding_Questions.Array;

import java.util.Scanner;

public class Binary_search {
    // Binary search method
    public static int binarySearch(int[] arr, int low, int high, int item) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == item)
                return mid; // Item found

            if (arr[mid] < item)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; // Item not found
    }

    public static void main(String[] args) {
        int[] arr = {9, 26, 33, 47, 53, 60, 75, 80, 86, 99};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the item which you want to find: ");
        int item = sc.nextInt();

        int location = binarySearch(arr, 0, arr.length - 1, item);

        if (location != -1) {
            System.out.println("Item found at location " + location);
        } else {
            System.out.println("Item not found");
        }

        sc.close();
    }
}