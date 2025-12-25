package TCS_iON_Coding_Questions.Arrays;

public class Search_an_element_in_array {
    public static void main(String[] args) {
        int arr[] = {6,7,9,5,3,10};
        int n = arr.length;
        int k = 10;
        int low = 0, high = n-1;
        int ans = -1;
        while (low <= high){
            int mid = (low + high)/2;

            if (arr[mid] > k) {
                high = mid - 1;
            }
            else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        System.out.print("The element is present in "+ans+" index");
    }
}
