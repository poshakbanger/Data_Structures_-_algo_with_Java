package Infosys_Coding_Questions;

public class Quickly_Swap_Two_Arrays {
    public static void main(String[] args) {
        int a[] = {11, 12, 13, 14};
        int b[] = {15, 16, 17, 18};

        // Print original arrays
        System.out.println("Before swapping:");
        printArray("Array A", a);
        printArray("Array B", b);

        // Swap arrays using a temporary reference
        int[] temp = a;
        a = b;
        b = temp;

        // Print swapped arrays
        System.out.println("\nAfter swapping:");
        printArray("Array A", a);
        printArray("Array B", b);
    }
    public static void printArray(String name, int[] arr) {
        System.out.print(name + ": ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
