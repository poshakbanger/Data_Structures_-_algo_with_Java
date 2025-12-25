package TCS_iON_Coding_Questions.Numbers;

public class Program_to_add_two_fractions {
    public static int _gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return _gcd(b, a % b);
    }
    public static void main(String[] args) {
        int num1 = 3, den1 = 4, num2 = 1, den2 = 7, num3, den3;
        int lcm = (den1 * den2) / _gcd(den1, den2);
    }
}
