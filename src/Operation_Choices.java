import java.util.Scanner;

public class Operation_Choices {
    public static int OperationChoices(int c, int a, int b){
        if (c == 1){
            return a+b;
        }
        if (c == 2){
            return a-b;
        }
        if (c == 3){
            return a*b;
        }
        if (c == 4){
            return a/b;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(OperationChoices(c,a,b));
    }
}
