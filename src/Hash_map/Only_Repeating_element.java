package Hash_map;
import java.util.Arrays;
import java.util.HashSet;

public class Only_Repeating_element {
    public static int findDuplicate(int arr[]){ // naive approach n^2 and n(1)
        int n = arr.length;
        int repEle = 0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j])
                    repEle = arr[i];
            }
        }
        return repEle;
    }

    public static int findDupEle(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);

        for (int i=0; i<n; i++){
            if (arr[i] == arr[i+1]) return arr[i];
        }
        return -1;
    }

    public static int find_duplicate_element(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        // create a Hashset
        for (int x : arr){
            if (set.contains(x))
                return x;
            set.add(x);
        }
        return -1;
    }

    public static int find_duplicate(int arr[]){ // [E.A.1] Sum Formula - O(n) Time and O(1) Space
        int n = arr.length;

        long sum = 0;
        for (int num : arr){
            sum += num;
        }

        long expectedSum = (long)(n - 1) * (n - 1 + 1) / 2;

        return (int)(sum - expectedSum);
    }

    public static int find_duplicate_ele(int arr[]){ // [E.A.2] Using XOR - O(n) Time and O(1) Space
        int n = arr.length;
        int res = 0;

        for (int i=0; i< arr.length-1; i++){
            res = res ^ (i+1) ^ arr[i];
        }
        res = res ^ arr[n-1];
        return res;
    }

    public static int find_dup_ele(int arr[]){ //  Using Elements as Indexes - O(n) Time and O(1) Space
        int n = arr.length;

        for (int i=0; i< n; i++){
            if (arr[Math.abs(arr[i])] < 0){
                return Math.abs(arr[i]);
            }
            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
        }
        return -1;
    }

    static void main() {
        int[] arr = {1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr));
        System.out.println(findDupEle(arr));
        System.out.println(find_duplicate_element(arr));
        System.out.println(find_duplicate(arr));
        System.out.println(find_duplicate_ele(arr));
        System.out.println(find_dup_ele(arr));
    }
}
