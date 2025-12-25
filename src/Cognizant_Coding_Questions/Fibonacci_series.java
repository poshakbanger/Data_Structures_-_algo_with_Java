package Cognizant_Coding_Questions;

public class Fibonacci_series {
    public static void fibonacci(int n){
        int a = 0, b = 1;
        for (int i=0; i<n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        return;
    }
    public static void main(String[] args) {
        int n = 5;
        fibonacci(n);
    }
}
