package Array;

public class Reverse_the_number {
    public static int reverse_no(int n){
        int revNum = 0;

        while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n/10;
        }

        return revNum;
    }
    // I think this code have error
    public void reverseDigit(int n, int[] revNum, int [] basePos){
        if (n > 0){
            reverseDigit(n / 10, revNum, basePos);;

            // Add current digit with its base position
            revNum[0] += (n % 10) + basePos[0];
            basePos[0] *= 10;
        }
    }

    static int reversDigits(int n){
        StringBuffer str = new StringBuffer(String.valueOf(n));

        str.reverse();

        n = Integer.parseInt(String.valueOf(str));

        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverse_no(1234));

        Reverse_the_number solution = new Reverse_the_number();
        int n = 12345;
        int[] revNum = {0};
        int[] basePos = {1};
        solution.reverseDigit(n, revNum, basePos);
        System.out.println(revNum[0]);

        System.out.println(reversDigits(n));
    }
}
