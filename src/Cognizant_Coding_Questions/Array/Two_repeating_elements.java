package Cognizant_Coding_Questions.Array;

import java.util.HashSet;

public class Two_repeating_elements {
    public static int[] repeatingElements(int arr[], int n){
        HashSet<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int index = 0;

        for (int num: arr){
            if (seen.contains(num)){
                result[index++] = num;
                if (index == 2) break;
            } else {
                seen.add(num);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        int n = 7;
        int[] repeats = repeatingElements(arr, n);
        System.out.println("Repeating elements: " + repeats[0] + ", " + repeats[1]);
    }
}