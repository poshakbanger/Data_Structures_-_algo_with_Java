package TCS_CodeVita_Questions;
import java.util.Scanner;

public class Banking_Interest_rate_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p;
        int totalYears;
        System.out.println("Enter the Principal Amount:");
        p = sc.nextDouble();
        System.out.println("Enter tenture Year:");
        totalYears = sc.nextInt();
        double[] bank = new double[2];
        int l = 0;

        for (int k=0; k<2; k++){
            System.out.println("Enter the No. of Slabs:");
            int n1 = sc.nextInt();
            double sum = 0;
            for (int i=0; i<n1; i++){
                System.out.println("Enter the Period:");
                int years = sc.nextInt();

                System.out.println("Enter the Interest:");
                double interest = sc.nextDouble();

                double sq = Math.pow(1+interest, years*12);
                double emi = (p * (interest))/(1 - 1/sq);
                sum += emi;
            }
            bank[l] = sum;
            l++;
        }

        double bankA = bank[0];
        double bankB = bank[1];

        if (bankA < bankB){
            System.out.println("bank A");
        }
        else {
            System.out.println("bank B");
        }
    }
}
