package Cognizant_Coding_Questions.Array;

public class Even_or_Odd {
    public static void number(int n){
        if (n % 2 == 0)
            System.out.println("Number "+ n + " is even");
        else System.out.println("Number "+ n + " is odd");
        return;
    }
    public static void main(String[] args) {
        int n = 6;
        number(n);
    }
}
