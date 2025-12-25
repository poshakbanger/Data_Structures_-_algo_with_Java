package Cognizant_Coding_Questions;

import java.util.Arrays;

public record Print_0_to_100_without_recursion_loop() {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[101];

        Arrays.setAll(numbers, i -> i); // Set each index to its value

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
