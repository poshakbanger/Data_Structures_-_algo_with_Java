package TCS_iON_Coding_Questions.Numbers;

public class Can_a_number_be_expressed_as_a_sum_of_two_prime_numbers {
    public static boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

        public static boolean isPrime(int n) {

            if (prime(n) && prime(n - 2)) {
                return true;
            } else {
                return false;
            }
    }
    public static void main(String[] args) {
        int n = 21;

        if (isPrime(n)) {
            System.out.println("Yes");
        } else if (isPrime(n)) {
            System.out.println("No");
        }
    }
}
