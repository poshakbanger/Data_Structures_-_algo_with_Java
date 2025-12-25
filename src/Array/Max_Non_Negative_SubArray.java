package Array;

public class Max_Non_Negative_SubArray {
    public int[] maxset(int[] A){
        if(A == null || A.length == 0) return new int[0];
        long bestSum = -1;
        int bestStart = 0;
        int bestLen = 0;

        long curSum = 0;
        int curLen = 0;
        int curStart = 0;

        for(int i=0; i<A.length; i++){
            if(A[i] >= 0){
                // extend current non-negative segment
                curSum += A[i];
                curLen++;
            } else {
                // evaluate current segment before resetting
                if(curLen > 0){
                    if(isBetter(curSum, curLen, curStart, bestSum, bestLen, bestStart)){
                        bestSum = curSum;
                        bestLen = curLen;
                        bestStart = curStart;
                    }
                }
                // reset current segment
                curSum = 0;
                curLen = 0;
                curStart = i+1;
            }
        }

        // final check for segment that may end at array end
        if(curLen > 0 && isBetter(curSum, curLen, curStart, bestSum, bestLen, bestStart)){
            bestSum = curSum;
            bestLen = curLen;
            bestStart = curStart;
        }

        if (bestSum == -1) return new int[0]; // no non-negative numbers found

        int[] result = new int[bestLen];
        System.arraycopy(A, bestStart, result, 0, bestLen);
        return result;

    }
    private boolean isBetter(long curSum, int curLen, int curStart,
                             long bestSum, int bestLen, int bestStart){
        if(curSum > bestSum) return true;
        if(curSum < bestSum) return false;
        // sums equal -> prefer longer
        if(curLen > bestLen) return true;
        if(curLen < bestLen) return false;

        return curStart < bestStart;
    }
}
