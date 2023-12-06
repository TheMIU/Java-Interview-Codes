import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");

        System.out.println("before : " + linkedList.toString()); // [one, two, three, four, five]
        reverse(linkedList);
        System.out.println("after  : " + linkedList.toString()); // [five, four, three, two, one]
    }

    private static void reverse(LinkedList<String> linkedList) {
        // Can simplify using Collections.reverse()
        // Collections.reverse(linkedList);

        // without using Collections.reverse()
        int left = 0;
        int right = linkedList.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            String temp = linkedList.get(left);
            linkedList.set(left, linkedList.get(right));
            linkedList.set(right, temp);

            // Move indices towards the center
            left++;
            right--;
        }
    }
}
