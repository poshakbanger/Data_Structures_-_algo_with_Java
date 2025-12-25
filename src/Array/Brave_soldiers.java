package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Brave_soldiers {
    static int braveSol(int n){
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);

        isPrime[0] = isPrime[1] = false;

        for (int i=2; i*i<=n; i++){
            if (isPrime[i]){
                for (int j=i*i; j<=n; j+= i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i=2; i<=n; i++){
            if (isPrime[i]) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = braveSol(n);
        System.out.println(result);
    }
}
