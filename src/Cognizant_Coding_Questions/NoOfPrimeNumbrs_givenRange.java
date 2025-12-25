package Cognizant_Coding_Questions;

public class NoOfPrimeNumbrs_givenRange {
    public static boolean isPrime(int n){
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int countPrimes(int L, int R){
        int count  = 0;
        for (int i = L; i <= R; i++){
            if (isPrime(i)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int L = 10, R = 50;
        int ans = countPrimes(L,R);
        System.out.println(ans);
    }
}
