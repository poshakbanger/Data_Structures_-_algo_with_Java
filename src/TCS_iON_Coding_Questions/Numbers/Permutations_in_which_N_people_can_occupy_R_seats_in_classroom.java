package TCS_iON_Coding_Questions.Numbers;

public class Permutations_in_which_N_people_can_occupy_R_seats_in_classroom {
    public static int factorial(int n ){
        int ans = 1;
        for (int i=1; i<=n; i++){
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6, r = 4;
        int num = factorial(n);
        int den = factorial(n - r);
        System.out.println(num / den);
    }
}
