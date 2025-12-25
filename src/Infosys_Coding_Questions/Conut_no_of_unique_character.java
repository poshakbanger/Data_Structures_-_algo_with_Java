package Infosys_Coding_Questions;

public class Conut_no_of_unique_character {
    public static void main(String[] args) {
        String input = "prepbytes";
        char[] charArray = input.toCharArray();
        int ans = 0;

        for (int i = 0; i < charArray.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                ans++;
            }
        }

        System.out.println("Number of unique characters: " + ans);
    }
}
