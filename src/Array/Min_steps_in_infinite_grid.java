package Array;

public class Min_steps_in_infinite_grid {
    public int coverPoints(int A[], int[] B){
        if(A == null || B == null) return 0;
        int n = A.length;
        if (n <= 1) return 0;

        long total = 0; // use long to avoid intermediate overflow for large n
        for(int i=1; i<n; i++){
            int dx = Math.abs(A[i] - A[i-1]);
            int dy = Math.abs(B[i] - B[i-1]);
            total += Math.max(dx,dy);
        }
        return (int)total;
    }
}
