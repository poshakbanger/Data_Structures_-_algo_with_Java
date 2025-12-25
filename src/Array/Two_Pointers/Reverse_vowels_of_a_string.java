package Array.Two_Pointers;

public class Reverse_vowels_of_a_string {
    public static String reverseVowels(String s){
        char arr[] = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while (left < right){
            while (left < right && !isVowel(arr[left])){
                left++;
            }
            while (left < right && !isVowel(arr[right])){
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
