package TCS_iON_Coding_Questions.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Find_all_repeating_elements_in_an_array {
    static void findRepeatingElements(int arr[]){
        HashMap<Integer,Integer> elementCount = new HashMap<>();
        for(int i:arr){
            if (elementCount.get(i) == null) elementCount.put(i,1);
            else elementCount.put(i,elementCount.get(i)+1);
        }
        System.out.print("The repeating elements are: ");
        for(Map.Entry<Integer,Integer> entry: elementCount.entrySet()) {
            if (entry.getValue() > 1)
                System.out.print(entry.getKey() + " ");
        }
    }
    public static void main(String[] args) {
            int[] arr = {1,1,2,3,4,4,5,2};
            findRepeatingElements(arr);
    }
}