package TCS_iON_Coding_Questions.Numbers;

public class Number_is_abundant_number_or_not {
    public static void main(String[] args) {
//        int n = 18;
//        int sum = 0;
//        for (int i=1; i<=n; i++){
//            if (n % i == 0){
//                sum += i;
//            }
//        }
//        sum -= n;
//        if (sum > n) {
//            System.out.print("Abundant Number");
//        } else {
//            System.out.print("Not Abundant Number");
//        }   // O(n)

        int n = 21;
        int sum = 0;
        for (int i =1; i*i<=n; i++){
            if (n % i == 0){
                if (n / i == i){
                    sum += i;
                } else {
                    sum += i;
                    sum += n / i;
                }
            }
        }
        sum -= n;
        if (sum > n) {
            System.out.print("Abundant Number");
        } else {
            System.out.print("Not Abundant Number");
        }
    }
}
