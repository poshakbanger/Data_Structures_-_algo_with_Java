package Accenture_Coding_Questions;

public class String_transformation {
    public static String transforString(String str){
        char[] charArray = str.toCharArray();
        for (int i=0; i<charArray.length; i++)
            if (charArray[i] == 'a')
                charArray[i] = 'b';
            else if (charArray[i] == 'b')
                charArray[i] = 'a';

        return new String(charArray);
    }
    public static void main(String[] args) {
        String str = "abaabbcc";
        System.out.println(transforString(str));
    }
}
