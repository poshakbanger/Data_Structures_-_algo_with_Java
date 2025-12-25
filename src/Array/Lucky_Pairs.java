package Array;

import java.util.Scanner;

public class Lucky_Pairs {
    public static int findLuckyStonePairs(int p, int n, int m, int[] stones){
        int luckyPairsNo = 0;

        for (int i=0; i<p; i++){
            if (stones[i] % 2 == 0 || stones[i] % 2 == 0){
                luckyPairsNo++;
            }
        }
        return (luckyPairsNo *(luckyPairsNo-1)) /2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] stones = new int[p];
        for (int i = 0; i < p; i++) {
            stones[i] = sc.nextInt();
        }
        int result = findLuckyStonePairs(p, n, m, stones);
        System.out.println(result);
    }
}
