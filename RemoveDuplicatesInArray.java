import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 4, 8, 5, 4, 2, 5, 6, 5, 3, 7 };

        System.out.println("before : " + Arrays.toString(arr));
        int[] sorted = removeDuplicates(arr);
        System.out.println("after  : " + Arrays.toString(sorted));

        // using inbuilt method
        int[] uniqueArray = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueArray));
    }

    private static int[] removeDuplicates(int[] arr) {
       /*  int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < temp.length; j++) {

                if (arr[i] == temp[j]) {
                    count++;
                }
            }
            System.out.println(count);

            if (count == 1) {
                temp[i] = arr[i];
            }
        }

        return temp; */

        Arrays.sort(arr); // Sort the array first
        int length = arr.length;
        
        if (length <= 1) {
            return arr; // If the array has 0 or 1 elements, it's already unique
        }

        int[] uniqueArray = new int[length];
        int index = 0;
        uniqueArray[index++] = arr[0]; // Always add the first element

        for (int i = 1; i < length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArray[index++] = arr[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }
}
