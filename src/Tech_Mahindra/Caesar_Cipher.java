package Tech_Mahindra;

import java.util.Scanner;

public class Caesar_Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();  // Read input string

        StringBuilder decryptedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int indexChar = ch - 'a';
            int decryptedInt = (indexChar + 3) % 26;
            decryptedStr.append((char) (decryptedInt + 'a'));
        }
        System.out.println(decryptedStr.toString());
    }
}
