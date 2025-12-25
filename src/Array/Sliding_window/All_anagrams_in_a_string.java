package Array.Sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_anagrams_in_a_string {
    public List<Integer> findAnagrams(String s, String p){

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        List<Integer> result = new ArrayList<>();

        // count frequency of characters in p
        for (char c: p.toCharArray()){
            pCount[c - 'a']++;
        }

        // sliding window to count frequency of characters in s
        for (int i=0; i< s.length(); i++){
            sCount[s.charAt(i) - 'a']++;

            // remove the character that is out of the window
            if (i >= p.length()){
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            // compare counts
            if (Arrays.equals(pCount,sCount)){
                result.add(i- p.length() + 1);
            }
        }
        return result;
    }
    static void main(String[] args) {

    }
}
