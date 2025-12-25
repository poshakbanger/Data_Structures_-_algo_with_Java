package TCS_iON_Coding_Questions.Numbers;

import java.util.ArrayList;

public class Prime_Factors_of_the_number {
    public static ArrayList<Integer> getPrimeFactors(int n){
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int i=2; i<= n; i++){
            if (n % i == 0){
                primeFactors.add(i);
            }
            while (n % i == 0) {
                n = n / i;
            }
        }
        return primeFactors;
    }
    public static void main(String[] args) {
        int n = 60;
        ArrayList<Integer> ans = getPrimeFactors(n);
        System.out.print("Prime Factors for " + n + ": ");
        for (int factor : ans) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }
}
