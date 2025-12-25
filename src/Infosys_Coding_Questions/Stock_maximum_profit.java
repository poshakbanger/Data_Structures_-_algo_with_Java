package Infosys_Coding_Questions;

public class Stock_maximum_profit {
    public static void main(String[] args) {
        int arr[] = {100, 180, 260, 310, 40, 535, 695};
        int n = arr.length;
        int profit = 0;

        // Traverse through the price array
        for (int i=1; i<n; i++){
            // If selling today is profitable (i.e., today's price is more than yesterday's)
            if (arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        System.out.println(profit);
    }
}
