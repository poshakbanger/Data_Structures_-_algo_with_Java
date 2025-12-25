package Cognizant_Coding_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_collections {
    public static void main(String[] args) {
        // creating a list of integers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        // sorting in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: "+ numbers);

        // Sorting in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: "+ numbers);
    }
}