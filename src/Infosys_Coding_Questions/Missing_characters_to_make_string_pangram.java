package Infosys_Coding_Questions;

public class Missing_characters_to_make_string_pangram {
    public static void main(String[] args) {
        String input = "welcome to prepbytes";
        input = input.toLowerCase();

        boolean[] present = new boolean[26];

        // Mark the characters that are present
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        // Find missing characters
        StringBuilder missing = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                missing.append((char)(i + 'a'));
            }
        }

        // Print missing characters
        System.out.println(missing.toString());
    }
}
