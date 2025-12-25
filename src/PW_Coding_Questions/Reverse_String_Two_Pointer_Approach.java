package PW_Coding_Questions;

import java.util.Scanner;

public class Reverse_String_Two_Pointer_Approach {
    public static String swap(String s, int i, int j){
        StringBuilder str = new StringBuilder(s);
        str.setCharAt(i, s.charAt(j));
        str.setCharAt(j, s.charAt(i));

        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;
        int j = str.length() - 1;

        // reversing a String
        while (i < j) {
            str = swap(str, i, j);
            i++;
            j--;
        }

        System.out.print("The reversed string is- "+ str);
    }
}
