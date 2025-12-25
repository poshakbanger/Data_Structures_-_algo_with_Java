package TCS_iON_Coding_Questions.Numbers;

public class Sum_of_numbers_in_the_given_range {

    public static void main(String[] args) {
//        int l = 2, r = 7;
//        int sum = 0;
//        for (int i =l; i<=r; i++){
//            sum += i;
//        }
//        System.out.print("The sum of the numbers in the given range is "+sum);

        int l = 2, r = 7;
        //sum(1 to r) - sum(1 to l-1)
        int ans = (r * (r + 1)) / 2 - ((l - 1) * (l)) / 2;
        System.out.print("The sum of the numbers in the given range is "+ans);
    }
}
