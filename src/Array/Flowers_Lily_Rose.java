package Array;
import java.util.*;

public class Flowers_Lily_Rose {
    public static List<Integer> userLogic(int n1, List<Integer> flowers, int n2, List<Integer> herbs){
        Map<Integer,Integer> flowerCount = new HashMap<>();
        Map<Integer,Integer> herbCount = new HashMap<>();

        for (int f: flowers){
            flowerCount.put(f, flowerCount.getOrDefault(f,0)+1);
        }

        for (int h: herbs){
            herbCount.put(h, herbCount.getOrDefault(h,0)+1);
        }

        List<Integer> result = new ArrayList<>();
        for (int f : flowers) {
            int countF = flowerCount.get(f);
            int countH = herbCount.getOrDefault(f, 0);

            if (countF > countH) {
                result.add(f);
            }
        }

        // If empty → return [-1]
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        List<Integer> flowers = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            flowers.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        List<Integer> herbs = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            herbs.add(sc.nextInt());
        }

        List<Integer> result = userLogic(n1, flowers, n2, herbs);

        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println(-1);
        } else {
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
