package TCS_iON_Coding_Questions.Numbers;

public class Find_Sum_of_AP_Series {
    public static float sumOfAP(float a, float d, int n){
        float sum = (n / 2.0f) * (2.0f * a + (n - 1) * d);
        return sum;
    }
    public static void main(String[] args) {
        float a = 1.5f, d = 3.0f; int  n = 5;
        System.out.println(sumOfAP(a,d,n));
    }
}
