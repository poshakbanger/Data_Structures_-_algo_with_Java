package TCS_iON_Coding_Questions.Numbers;

public class Number_is_palindrome_or_not {
    static boolean palindrome(int n){
        int revNum = 0;
        int dup = n;
        while (n>0){
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        if (dup == revNum){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int number = 4554;

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
