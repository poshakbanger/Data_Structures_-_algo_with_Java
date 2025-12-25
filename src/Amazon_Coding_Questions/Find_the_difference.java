package Amazon_Coding_Questions;

public class Find_the_difference {
    public static char findTheDifference(String s, String t){
        int sum = 0;

        for (char ch: t.toCharArray())
            sum += ch;
        for (char ch: s.toCharArray())
            sum -= ch;

        return (char) sum;
    }
    public static void main(String[] args) {
        String s = "";
        String t = "o";
        System.out.println(findTheDifference(s,t));
    }
}
