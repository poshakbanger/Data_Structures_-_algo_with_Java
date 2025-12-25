package Hash_map;

import java.util.HashSet;
import java.util.Set;

public class Disjoint_array_or_set {
    public static boolean isDisjoint(int[] a, int[] b){
        Set<Integer> hashset = new HashSet<>();

        for(int num : a){
            if (hashset.add(num));
        }

        for(int num : b){
           if (!hashset.contains(num))
                    return true;
        }
        return false;
    }

    static void main(String[] args) {
        int[] a = { 11, 1, 13, 21, 3 };
        int[] b = { 11, 3, 7, 1 };

        if (isDisjoint(a, b)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
