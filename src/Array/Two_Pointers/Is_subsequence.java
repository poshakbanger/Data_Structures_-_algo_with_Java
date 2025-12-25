package Array.Two_Pointers;

public class Is_subsequence {
    public static boolean isSubsequence(String s, String t){
        if (s == null || t == null) return false;
        int n = s.length();
        int m = t.length();
        int i=0, j=0;

        while (i < n && j < m){
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == n;
    }
    static void main(String[] args) {
        String s = "abcz";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
