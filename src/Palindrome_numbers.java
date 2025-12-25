import java.util.Scanner;

public class Palindrome_numbers {
    public static int palindrome(int nol){
        int rem = 0;
        int div = nol;
        while (div != 0){
            int r = div % 10;
            rem = (rem * 10) + r;
            div = div / 10;
        }
        return  rem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ul = sc.nextInt();
        int ll = sc.nextInt();

        for (int i = ul; i<= ll; i++){
            if (i == palindrome(i))
                System.out.print(i+ " ");
        }
    }
}
