package Array.Sliding_window;
import java.util.HashSet;
import java.util.Set;

public class Longest_substring_without_repeating_character {
    public static int lengthOfLongestSubstring(String s){
        int start = 0, maxLen = 0;

        Set<Character> set = new HashSet<>();

        for(int end =0; end <s.length(); end++){
            while (set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
    static void main(String[] args) {

    }
}