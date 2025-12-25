package Array.Two_Pointers;

public class Check_Palindrome {
    public static boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    static void main(String[] args) {

    }
}
