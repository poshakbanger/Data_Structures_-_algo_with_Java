package Infosys_Coding_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_a_string_of_Character {
    public static void main(String[] args) {

        String input = "programming";

        // Convert string to a character array
        char[] chars = input.toCharArray();

        // Sort the character array
        Arrays.sort(chars);

        // Convert sorted character array back to string
        String sortedString = new String(chars);

        // Print the sorted string
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
