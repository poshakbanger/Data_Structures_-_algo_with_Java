package Cognizant_Coding_Questions.Array;

public class Average_of_array {
    public static double avgRec(int a[], int i, int n){
        // last element
        if (i == n-1) return a[i];

        // When index is 0, divide sum computed so far by n.
        if (i == 0)
            return ((a[i] + avgRec(a, i+1, n))/n);

        // Compute sum
        return (a[i] + avgRec(a, i+1, n));
    }

    static double average(int a[], int n) {
        return avgRec(a, 0, n);
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        System.out.println(average(arr, n));
    }
}
