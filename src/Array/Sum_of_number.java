package Array;

public class Sum_of_number {
    public static int sumOfDigits(int n){
        int sum = 0;
        while (n != 0){
            // extract the last digit
            int last = n % 10;
            // sum the digit
            sum += last;
            // remove the digit
            n /= 10;
        }
        return sum;
    }

    public static int SumOfDigits(int n){
        // base case
        if (n ==0) return 0;

        // recursive case
        return (n % 10) + SumOfDigits(n / 10);
    }

    public static int sumOfDigit(int n){
        // convert number to string
        String s = Integer.toString(n);
        int sum = 0;

        for (char ch : s.toCharArray()){
            sum += ch - '0';
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigits(n));
        System.out.println(SumOfDigits(n));
        System.out.println(sumOfDigit(n));
    }
}