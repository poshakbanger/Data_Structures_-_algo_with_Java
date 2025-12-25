package TCS_iON_Coding_Questions.Arrays;

import java.util.HashMap;

public class Find_all_Symmetric_Pairs {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

        HashMap<Integer,Integer> mp = new HashMap<>();
        System.out.println("The Symmetric Pairs are: ");
        for (int i=0; i<arr.length; i++){
            int first = arr[i][0];
            int second = arr[i][1];
            if (mp.get(second) != null && mp.get(second) == first)
                System.out.println("("+first + " " + second+") ");
            else mp.put(first, second);
        }
    }
}
