package Accenture_Coding_Questions;

public class Palindrome {
    public static boolean palindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false; // not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}