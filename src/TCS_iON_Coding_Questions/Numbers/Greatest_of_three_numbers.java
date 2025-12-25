package TCS_iON_Coding_Questions.Numbers;

public class Greatest_of_three_numbers {
    public static void main(String[] args) {
        double num1 = 1.123, num2 = 1.124, num3 = 1.125;
        System.out.println("The greatest of the three numbers is "+Math.max(num1, Math.max(num2, num3)));
    }
}
