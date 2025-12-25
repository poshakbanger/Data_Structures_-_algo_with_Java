package Array;

public class Perfect_No {
    static boolean isPerfect(int n){
        int sum = 0;

        for (int i=1; i< n; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }

    public static boolean isPerfectNo(int n){
        // to store sum of divisors
        int sum = 0;

        // find all divisors and add them
        for (int i=2; i*i<=n; i++){
            if (n%i == 0){
                if (i*i != n)
                    sum = sum + i + n / i;
                else sum = sum + i;
            }
        }
        return sum == n && n != 1;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPerfect(n) ? "true" : "false");
    }
}
