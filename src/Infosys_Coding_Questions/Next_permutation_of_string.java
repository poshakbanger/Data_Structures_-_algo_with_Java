package Infosys_Coding_Questions;

public class Next_permutation_of_string {
    public static void main(String[] args) {
        String input = "abc";
        String next = nextPermutation(input);

        if (next != null) {
            System.out.println("Next permutation: " + next);
        } else {
            System.out.println("No next permutation (string is the highest permutation).");
        }
    }

    public static String nextPermutation(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;

        int i = n-2;
        while (i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }
        if (i == -1){
            return null;
        }
        int j = n-1;
        while (arr[j] <= arr[i]){
            j--;
        }

        swap(arr, i, j);
        reverse(arr,i+1,n-1);
        return new String(arr);
    }
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
