package Hash_map;

import java.util.ArrayList;
import java.util.HashSet;

public class Union_of_two_arrays {
    public static ArrayList<Integer> union_of_arrays(int a[], int b[]){
        ArrayList<Integer> res = new ArrayList<>();

        for (int num: a){
            if (!res.contains(num)){
                res.add(num);
            }
        }

        for (int num: b){
            if (!res.contains(num)){
                res.add(num);
            }
        }
        return res;
    }
    public static ArrayList<Integer> union(int a[], int b[]){ // Using Hash Set - O(n+m) Time and O(n+m) Space
        HashSet<Integer> st = new HashSet<>();

        for (int num : a){
            st.add(num);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int num: b){
            st.add(num);
        }

        for (int it: st){
            res.add(it);
        }
        return res;
    }
    static void main(String[] args) {
//        int[] a = { 1, 2, 3, 2, 1 };
//        int[] b = { 3, 2, 2, 3, 3, 2 };
//
//        ArrayList<Integer> res = union_of_arrays(a, b);
//
//        for (int num : res) {
//            System.out.print(num + " ");
//        }

        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> res = union(a, b);

        for (int num : res)
            System.out.print(num + " ");
    }
}
