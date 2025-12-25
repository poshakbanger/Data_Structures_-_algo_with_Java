package Cognizant_Coding_Questions;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = 0;

        try {
            while (true) {
                str.charAt(length); // try to access character at 'length' index
                length++;
            }
        } catch (Exception e) {
            // when index goes out of bounds, we catch the exception
        }

        System.out.println("Length of the string: " + length);
    }
}
