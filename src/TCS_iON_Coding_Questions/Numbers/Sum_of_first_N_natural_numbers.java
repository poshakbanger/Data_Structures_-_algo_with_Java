package TCS_iON_Coding_Questions.Numbers;

public class Sum_of_first_N_natural_numbers {
    public static void solve(int N) {
        int sum = N * (N + 1) / 2;
        System.out.println("The sum of the first " + N + " numbers is: " + sum);
    }
    public static void main(String[] args) {
        solve(5);
        solve(6);
    }
}
