package Accenture_Coding_Questions;

public class Square_Root_Difference {
    public static double squareRootDifference(int m, int n){
        double evenSum = 0, oddSum = 0;
        for (int i = m; i<=n; i++){
            double squareRoot = Math.sqrt(i);
            if (i % 2 == 0){
                evenSum += squareRoot;
            } else {
                oddSum += squareRoot;
            }
        }
        return evenSum - oddSum;
    }
    public static void main(String[] args) {
        int m = 1, n = 10;
        double result = squareRootDifference(m,n);
        System.out.println(result);
    }
}
