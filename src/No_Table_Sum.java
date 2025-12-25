import java.util.Scanner;

public class No_Table_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int no = sc.nextInt();
        int sum = 0, value = 1;
        for (int i=1; i<= 10; i++){
            value = no * i;
            System.out.print(value + " ");
            sum = sum + value;
        }
        System.out.println("\nSum is "+ sum);
    }
}
