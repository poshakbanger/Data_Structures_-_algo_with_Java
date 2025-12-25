package TCS_iON_Coding_Questions.Numbers;

public class Replace_all_0s_with_1s_in_a_given_integer {
    public static int replaceZerosWithOnes(int n){
        if (n == 0){
            return 1;
        }
        int ans = 0, tmp = 1;
        while (n > 0){
            int d = n % 10;
            if (d == 0){
                d = 1;
            }
            ans = d * tmp + ans;
            n = n / 10;
            tmp = tmp * 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 204;
        int result = replaceZerosWithOnes(n);
        System.out.println("After replacing zeros with ones " + n + " becomes " + result);
    }
}
