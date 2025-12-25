package Accenture_Coding_Questions;

public class Count_the_Occurrences {
    public static int countOccurrences(int[] arr, int element){
        int count = 0;
        for (int num: arr){
            if (num == element){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,2};
        int element = 2;
        int result = countOccurrences(arr,element);
        System.out.println(result);
    }
}
