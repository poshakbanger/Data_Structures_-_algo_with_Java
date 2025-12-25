package IBM_Coding_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of permutation
        int m = sc.nextInt();

        // initialize the permutation P = [1,2,3,..]
        List<Integer> permutation = new ArrayList<>();
        for (int i=0; i<m; i++){
            permutation.add(i);
        }

        //read no. of q
        int q = sc.nextInt();

        //read all queries
        List<Integer> queries = new ArrayList<>();
        for (int i=0; i<q; i++){
            queries.add(sc.nextInt());
        }

        //initialize result list
        List<Integer> result = new ArrayList<>();

        //process each query
        for (int i=0; i<q; i++){
            int query = queries.get(i);

            // find the index of query element
            int index = permutation.indexOf(query);

            // add the result of index
            result.add(index);

            // Move the queried number to front
            permutation.remove(index);
            permutation.add(0, query);

            // 7. Print all results space-separated
            for (int res : result) {
                System.out.print(res + " ");
            }
        }
    }
}
