package IBM_Coding_Questions;

import java.util.*;

public class Maximum_no_of_coins {
    static int countCoins1(int lowLimit, int highLimit){
        int[] cnt = new int[46];
        for (int i=lowLimit; i<highLimit; i++){
            int sum = 0, n = i;
            while (n > 0){
                sum += n % 10;
                n /= 10;
            }
            ++cnt[sum];
        }
        return Arrays.stream(cnt).max().getAsInt();
    }

    static int countCoins(List<Integer> arr){
        Collections.sort(arr);
        int low = arr.get(0);
        int high = arr.get(arr.size() - 1);
        return countCoins1(low, high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(countCoins(arr));
    }
}
