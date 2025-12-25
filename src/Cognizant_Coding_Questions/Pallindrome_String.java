package Cognizant_Coding_Questions;

public class Pallindrome_String {
    static boolean isPalindrome(char[] s){
        int left = 0, right = s.length - 1;
        while (left < right){
            if (s[left] != s[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "weew";
        char[] s = str.toCharArray();
        System.out.println(isPalindrome(s));
        //System.out.println(new String(s));
    }
}
