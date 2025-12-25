package Accenture_Coding_Questions;

public class Rearrangement_Of_Bits {
    public static void main(String[] args) {
        int n = 10; // Example input
        int count = 0;

        // Count the number of 1 bits in n
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }

        int ans = 0;
        int power = 1;

        // Generate the number with 'count' 1 bits
        for (int i = 0; i < count; i++) {
            ans += power;
            power = power << 1;
        }
        System.out.println(ans); // Output the result
    }
}
