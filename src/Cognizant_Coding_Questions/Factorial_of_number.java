package Cognizant_Coding_Questions;

public class Factorial_of_number {
    public static int Factorial(int n){
        int result = 1;
        for (int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = Factorial(n);
        System.out.println(ans);
    }
}
