package Array;

public class Check_if_a_number_is_a_power_of_another_no {
    public static boolean isPower(int x, int y){
        if (x == 1) return (y == 1);

        // repeatedly compute power of x
        long pow = 1;
        while (pow < y)
            pow *= x;

        return (pow == y);
    }

    public static boolean is_Power(int x, int y){
        double res1 = Math.log(y) / Math.log(x);
        return res1 == Math.floor(res1);
    }
    public static void main(String[] args) {
        System.out.println(isPower(10, 1));
        System.out.println(isPower(1, 20));
        System.out.println(isPower(2, 128));
        System.out.println(isPower(2, 30));

        System.out.println(isPower(2, 128));
    }
}
