import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] arr = { "one", "two", "three", "four", "five" };

        System.out.println("before : " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("after  : " + Arrays.toString(arr));
    }

    private static void reverse(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
