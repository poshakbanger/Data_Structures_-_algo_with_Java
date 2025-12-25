package Dynamic_Programing;

public class Climbing_Stairs {
    public static int climbStairs(int n){
        if (n == 1 || n== 2 || n==3) return n;

        int array[] = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        for (int i=3; i<=n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
