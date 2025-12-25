package Cognizant_Coding_Questions;

public class Reverse_string {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            swap(s, left++, right--);
        }
    }

    public static void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }

    public static void main(String[] args) {
        String str = "Royal Challengers Bangaluru";
        char[] s = str.toCharArray();  // Convert string to char array
        reverseString(s);
        System.out.println(new String(s)); // Convert char array back to String and print
    }
}
