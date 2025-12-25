package Array;
import java.util.Scanner;

public class Mountains_and_Valley {
    static int isMountainValleyPattern(int[] arr){
        int n = arr.length;
        if (n == 1) return 1;
        if (arr[0] == arr[1]) return 0;

        boolean shoulIncrease = arr[0] < arr[1];

        for (int i=1; i<n-1; i++){
            if (shoulIncrease){
                if (!(arr[i] > arr[i+1])) return 0;
            }
            else {
                if (!(arr[i] < arr[i+1])) return 0;
            }

            shoulIncrease = ! shoulIncrease;
        }
        return 1;
    }

//    static int isMountvalley(int arr[]){
//        int n = arr.length;
//        if (n == 1) return 1;
//
//        // complete first sign
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = isMountainValleyPattern(arr);
        System.out.println(result);
    }
}
