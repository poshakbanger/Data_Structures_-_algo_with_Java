package TCS_iON_Coding_Questions.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Replace_each_element_of_the_array_by_its_rank {
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,98,6};
        HashMap< Integer, Integer > mp = new HashMap < Integer, Integer > ();
        int temp = 1;
        int n = arr.length;
        int brr[] = new int[n];
        for (int i=0; i<n; i++){
            brr[i] = arr[i];
        }
        Arrays.sort(brr);
        for (int i=0; i<n; i++){
            //if element is previously not store in the map
            if (mp.get(brr[i]) == null) {
                mp.put(brr[i], temp);
                temp++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }
    }
}
