import java.util.Arrays;

public class SecondLargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 4, 8, 5, 4, -2, 5, 9, 3, 7 };

        // using sort
        Arrays.sort(arr);
        System.out.println("Second Largest Number  : " + arr[arr.length - 2]);
        System.out.println("Second Smallest Number : " + arr[1]);
    }
}
