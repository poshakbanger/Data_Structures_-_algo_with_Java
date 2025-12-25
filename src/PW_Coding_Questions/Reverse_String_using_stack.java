package PW_Coding_Questions;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_String_using_stack { // O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] reverseString = new char[s.length()];
        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }

        int i=0;
        while (!stack.isEmpty()){
            reverseString[i++] = stack.pop();
        }
        // return string object
        s=  new String(reverseString);
        System.out.print("The reversed string is- "+ s);
    }
}
