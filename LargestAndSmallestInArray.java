import java.util.Arrays;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 4, 8, 5, 4, -2, 5, 9, 3, 7 };

        // without sorting
        System.out.println("Largest Number  : " + getLargestNumber(arr));
        System.out.println("Smallest Number : " + getSmallestNumber(arr));

        // using sort
        Arrays.sort(arr);
        System.out.println("Largest Number  : " + arr[arr.length - 1]);
        System.out.println("Smallest Number : " + arr[0]);
    }

    private static int getSmallestNumber(int[] arr) {
        int smallest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    private static int getLargestNumber(int[] arr) {
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
