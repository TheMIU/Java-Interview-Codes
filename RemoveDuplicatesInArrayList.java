import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 2, 6, 4, 8, 5, 4, 2, 5, 6, 5, 3, 7));

        System.out.println("before : " + arr);
        ArrayList<Integer> unique = removeDuplicates(arr);
        System.out.println("after  : " + unique);
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer value : arr) {
            if (!unique.contains(value)) {
                unique.add(value);
            }
        }
        return unique;
    }
}
