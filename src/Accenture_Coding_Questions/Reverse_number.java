package Accenture_Coding_Questions;

   public class Reverse_number {
       public static void main(String[] args) {
           int num = 12345;
           int reversed = 0;

           System.out.println("Original Number "+ num);

           while (num != 0){
               //get last digit from num
               int digit = num % 10;
               reversed = reversed * 10 + digit;

               //remove the last digit from num
               num/=10;
           }
           System.out.println("Reversed Number:"+ reversed);
       }
}