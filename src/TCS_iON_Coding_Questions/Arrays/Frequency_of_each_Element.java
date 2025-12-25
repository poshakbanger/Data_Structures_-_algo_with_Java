package TCS_iON_Coding_Questions.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency_of_each_Element {
    static void countFreq(int arr[], int n){
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i =0; i<n; i++){
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i])+1);
        }
        for (int i=0; i<n; i++){
            if (mp.get(arr[i]) != -1){
                System.out.println(arr[i] + " " + mp.get(arr[i]));
                mp.put(arr[i], -1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        countFreq(arr, n);
    }
}
