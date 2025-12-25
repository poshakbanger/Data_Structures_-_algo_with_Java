package Capgemini_Coding_Questions;

public class String_char_number {
    public static String helper(String str){
        String ans = "";
        if (str.length() == 0) return "";

        char ch = str.charAt(0);
        int count = 1;

        for (int i=1; i<str.length(); i++){
            if (str.charAt(i) == ch) count++;
            else {
                ans += ch;
                ans += Integer.toString(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        ans += ch;
        ans += Integer.toString(count);

        return ans;
    }
    public static void main(String[] args) {
        String str = "tttooppp";
        System.out.println(helper(str));
    }
}