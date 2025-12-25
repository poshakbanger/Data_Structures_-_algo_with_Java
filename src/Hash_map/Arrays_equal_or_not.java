package Hash_map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arrays_equal_or_not {
    public static boolean isEqual(int [] a, int [] b){ // naive approach
        if (a.length != b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i =0; i <a.length; i++){

                if (a[i] != b[i])
                    return false;

        }
        return true;
    }

    public static boolean checkEqual(int [] a, int [] b){ // [Expected Approach] Using Hashing- O(n) Time and O(n) Space
        int n = a.length, m = b.length;
        if (n != m) return false;

        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for (int i=0; i<n; i++){
            if (map.get(a[i]) == null)
                map.put(a[i], 1);
            else {
                count = map.get(a[i]);
                count++;
                map.put(a[i], count);
            }
        }

        for (int i=0; i<n; i++){
            if (!map.containsKey(b[i])){
                return false;
            }
            if (map.get(b[i]) == 0)
                return false;

            count = map.get(b[i]);
            --count;
            map.put(b[i], count);
        }
        return true;
    }

    static void main(String[] args) {
//        int a[] = {2,5,4,7,8,1};
//        int b[] = {3,4,7,8,1,2};
//
//        System.out.println(isEqual(a,b));

        int a[] = { 3, 5, 2, 5, 2 };
        int b[] = { 2, 3, 5, 5, 2 };

        if (checkEqual(a, b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
