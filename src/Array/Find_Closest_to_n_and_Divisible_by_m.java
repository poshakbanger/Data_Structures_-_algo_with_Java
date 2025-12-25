package Array;

public class Find_Closest_to_n_and_Divisible_by_m {
    static int closestNumber(int n, int m){
        // find the quotient
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        // check numbers around n
        for (int i = n - Math.abs(m); i <= n + Math.abs(m); i++){
            if (i % m == 0){
                int difference = Math.abs(n-i);

                if (difference < minDifference || (difference == minDifference && Math.abs(i) > Math.abs(closest))){
                    closest = i;
                    minDifference = difference;
                }
            }
        }
        return closest;
    }

    static int closestNo(int n, int m){
        int q = n/m;
        // first possible closest number
        int n1 = q * m;
        // second possible closest number
        int n2 = (n*m) > 0 ? (m*(q+1)):(m*(q-1));
        // If true then n1 is the required closest number
        if (Math.abs(n-n1) < Math.abs(n-n2))
            return n1;
        else return n2;

    }
    public static void main(String[] args) {
        int n = 13, m = 4;
        System.out.println(closestNumber(n, m));
        System.out.println(closestNo(n,m));
    }
}
