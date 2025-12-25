package TCS_iON_Coding_Questions.Numbers;

public class Year_is_a_leap_year_or_not {
    public static void main(String[] args) {
        int year = 1993;
        if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
