package Cognizant_Coding_Questions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort_elements_by_frequency {
    public static ArrayList<Integer> sortByFreq(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);
        // create a 2d vector to store the frequency of each element
        ArrayList<ArrayList<Integer>> freq = new ArrayList<>();

        // to sort the frequency in descending order
        Comparator<ArrayList<Integer>> comp = new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                if (a.get(0).equals(b.get(0)))
                    return a.get(1) - b.get(1);
                return b.get(0) - a.get(0);
            }
        };

        for (int i=0; i<n; i++){
            // to store the frequency
            int cnt = 1;
            while(i < n - 1 && arr[i] == arr[i + 1]) {
                cnt++;
                i++;
            }

            // push the frequency and the element
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(cnt);
            temp.add(arr[i]);
            freq.add(temp);
        }
        // sort the frequency array
        Collections.sort(freq, comp);

        // to store the answer
        ArrayList<Integer> ans = new ArrayList<>();

        // push the elements in the answer array
        for (int i = 0; i < freq.size(); i++) {
            int count = freq.get(i).get(0);
            int value = freq.get(i).get(1);
            for (int j = 0; j < count; j++) {
                ans.add(value);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 6, 4};
        ArrayList<Integer> ans = sortByFreq(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
