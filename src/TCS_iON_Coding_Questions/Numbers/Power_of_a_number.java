package TCS_iON_Coding_Questions.Numbers;

public class Power_of_a_number {
    static double myPow(double x, int n){
        double ans = 1;
        double oriNum = n;

        if (x == 0 || x == 1) {
            return x;
        }

        if (n < 0) {
            x = 1 / x;
            n = -(n + 1);
            ans = ans * x;
        }

        while (n > 0) {
            // If 'n' is odd, multiply
            // 'ans' by 'x' and
            // decrement 'n' by 1
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            }
            // If 'n' is even, divide
            // 'n' by 2 and multiply
            // 'x' by itself
            else {
                n = n / 2;
                x = x * x;
            }
        }
        // Return the final result
        return ans;
    }
    public static void main(String[] args) {
        double x = 2;
        int n = 21;
        System.out.println("Base: " + x);
        System.out.println("Power: " + n);

        double result = myPow(x, n);
        System.out.println("Result: " + result);
    }
}
