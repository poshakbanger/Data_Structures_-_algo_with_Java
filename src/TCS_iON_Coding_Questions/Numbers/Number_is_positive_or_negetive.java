package TCS_iON_Coding_Questions.Numbers;

public class Number_is_positive_or_negetive {
    public static void checkNumber(int n){
        if (n > 0) {
            System.out.println(n + " is positive.");
        } else {
            System.out.println(n + " is negative.");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        checkNumber(n);
        n = -6;
        checkNumber(n);
    }
}
