package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prime_Number_Square {
    static List<Integer> generatePrimes(int limit){
        boolean[] isPrime = new boolean[limit+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;

        for (int i=2; i*i<= limit; i++){
            if (isPrime[i]){
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

    List<Integer> primes = new ArrayList<>();
        for (int i=2; i<= limit; i++){
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // We need 100000 primes → upper bound around 1.3 million
        int limit = 1300000;
        List<Integer> primes = generatePrimes(limit);

        int nthPrime = primes.get(N - 1); // 1-based indexing

        long answer = (long) nthPrime * nthPrime; // square
        System.out.println(answer);
    }
}
