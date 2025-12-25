package TCS_iON_Coding_Questions.Numbers;

public class Factorial_of_a_number {
    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
