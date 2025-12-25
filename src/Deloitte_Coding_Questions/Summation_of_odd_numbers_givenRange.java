package Deloitte_Coding_Questions;

public class Summation_of_odd_numbers_givenRange {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = 0;

        for (int i=x; i<= y; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers between " + x + " and " + y + " is: " + sum);
    }
}
