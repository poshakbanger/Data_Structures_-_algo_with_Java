package Infosys_Coding_Questions;

public class Triangle_Problem {
    public static void main(String[] args) {
        int arr[] = {4, 7, 3, 6, 7};
        int n = arr.length;

        // Temporary array to work with
        int temp[] = new int[n];

        // Copy original array into temp
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }

        //start building triangle
        for (int i=n; i>0; i--){
            //print current row
            for (int j = 0; j < i; j++) {
                System.out.print(temp[j] + " ");
            }
            System.out.println();

            // Calculate next row by adding adjacent elements
            for (int j=0; j<i-1; j++){
                temp[j] = temp[j] + temp[j+1];
            }
        }
    }
}
