package Hash_map;

import java.util.ArrayList;
import java.util.HashMap;

public class Fizz_Buzz {
    public static ArrayList<String> fizzbuzz(int n){ // [Better Approach] By String Concatenation
        ArrayList<String> res = new ArrayList<>();

        for (int i=0; i< n; i++){
            String s = "";
            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";
            if (s.isEmpty()) s += i;

            res.add(s);
        }
        return res;
    }

    public static ArrayList<String> fizzBuzz(int n){ // [Expected Approach] Using Hash Map or Dictionary
        ArrayList<String> result = new ArrayList<>();

        HashMap<Integer,String> map = new HashMap<>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");

        int[] divisors = { 3,5 };

        for (int i=0; i<n; i++){
            StringBuilder s = new StringBuilder();

            for (int d: divisors){
                if (i % d == 0)
                    s.append(map.get(d));
                if (s.length() == 0) s.append(i);

                result.add(s.toString());
            }
        }
        return result;
    }
    static void main() {
//        int n = 20;
//        ArrayList<String> res = fizzbuzz(n);
//
//        for (String s : res) {
//            System.out.print(s + " ");
//        }

        int n = 20;
        ArrayList<String> res = fizzBuzz(n);

        for (String s : res) {
            System.out.print(s + " ");
        }
    }
}
