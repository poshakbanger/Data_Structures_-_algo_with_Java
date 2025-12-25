package Hash_map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_two_arrays {
    public static ArrayList<Integer> intersection(int a[], int b[]){ //[Naive Approach] Using Triple Nested Loops - O(n × n × m) Time and O(1) Space
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        int m = b.length;

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (a[i] == b[j]){
                    if (!res.contains(a[i])){
                        res.add(a[i]);
                    }
                }
            }
        }
        return res;
    }

//    Step By Step Implementations:
//    Initialize an empty array for result
//    Create a hash set as (Set of a[] elements) and put all distinct items of a[] into it. For example, if array is [1, 2, 1, 3, 1], as is going to store [1, 2, 3]
//    Create an empty hash set for result rs (Set of result elements)
//    Create an empty array res[] to store result
//    Traverse through all items of b[]. If an item is in as and not in rs, then add it to res[] and rs
//    Return res[]
    public static ArrayList<Integer> inter_section(ArrayList<Integer> a, ArrayList<Integer> b){ // Using Two Hash Sets - O(n+m) Time and O(n) Space
        // Put all elements of a[] in as
        Set<Integer> as = new HashSet<>(a);
        Set<Integer> rs = new HashSet<>();

        ArrayList<Integer> res = new ArrayList<>();

        // traverse through b[]
        for (int i=0; i<b.size(); i++){
            if (as.contains(b.get(i)) && !rs.contains(b.get(i))){
                rs.add(b.get(i));
                res.add(b.get(i));
            }
        }
        return res;
    }

    public static ArrayList<Integer> intersect(int[] a, int[] b){
        // put all elements of a[] in sa
        HashSet<Integer> sa = new HashSet<>();
        for (int num : a){
            sa.add(num);
        }

        ArrayList<Integer> res = new ArrayList<>();
        // traverse through b[]
        for (int num: b){
            if (sa.contains(num)){
                res.add(num);
                sa.remove(num);
            }
        }
        return res;
    }

          static void main(String[] args) {
//        int[] a = {1, 2, 3, 2, 1};
//        int[] b = {3, 2, 2, 3, 3, 2};
//
//        ArrayList<Integer> res = intersection(a, b);
//
//        for (int val : res) {
//            System.out.print(val + " ");
//        }

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3, 2, 2, 3, 3, 2));
//
//        ArrayList<Integer> res = inter_section(a, b);
//
//        for (int i = 0; i < res.size(); i++)
//            System.out.print(res.get(i) + " ");

              int[] a = {1, 2, 3, 2, 1};
              int[] b = {3, 2, 2, 3, 3, 2};

              ArrayList<Integer> res = intersect(a, b);

              for (int val : res) {
                  System.out.print(val + " ");
              }
    }
}
