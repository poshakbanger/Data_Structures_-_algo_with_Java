import java.util.Scanner;

public class Difference_of_Sum {
    public static int differenceofSum(int n,int m){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i<= m; i++){
            if(i % n == 0)
                sum1 = sum1 + i;
            else
                sum2 = sum2 + i;
        }
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(differenceofSum(n,m));
    }
}
