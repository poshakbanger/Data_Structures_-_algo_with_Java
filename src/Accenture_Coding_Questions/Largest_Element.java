package Accenture_Coding_Questions;

public class Largest_Element {
    public static void main(String[] args) {
        int arr[] = {1,3,4577,98};
        int max = arr[0];
        for (int i=0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element present in given arr: "+ max);
    }
}