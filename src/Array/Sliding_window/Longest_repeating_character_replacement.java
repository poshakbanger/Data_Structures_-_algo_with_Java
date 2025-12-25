package Array.Sliding_window;

public class Longest_repeating_character_replacement {
    public static int characterReplacement(String s, int k){
        int[] freq = new int[26];
        int left = 0;
        int maxWindow = 0;
        int maxFreq = 0;
        int n = s.length();

        for(int right =0; right < n; right++){
            // update the frequency of the current character
            freq[s.charAt(right) - 'A']++;

            // update the max frequency
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int windowLength = right - left + 1;

            // if the (windowLength - maxFreq) > k, then we need to shrink the window
            if (windowLength - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windowLength = right - left + 1;
            maxWindow = Math.max(maxWindow, windowLength);
        }
        return maxWindow;
    }
    static void main(String[] args) {
        String s = "AABABCC";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }
}
