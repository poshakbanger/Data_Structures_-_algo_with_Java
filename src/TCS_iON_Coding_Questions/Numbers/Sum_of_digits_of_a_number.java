package TCS_iON_Coding_Questions.Numbers;

public class Sum_of_digits_of_a_number {
    static private int getSum(int n){
        int d;
        int sum = 0;
        while (n != 0){
            d = n % 10;
            sum += d;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 472;
        System.out.print("Sum of digits of the given number is "+getSum(n));
    }
}
