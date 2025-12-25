package Accenture_Coding_Questions;

public class Number_table_and_multiplication {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int table = 1;
        for (int i=1; i<=10; i++){
            table = n * i;
            System.out.print(table + " ");
            sum = sum + table;
        }

        System.out.println("\nSum is: "+ sum);
    }
}