public class StringReverse {
    public static void main(String[] args) {
        String string = "Hello!";
        String reversed = reverse(string);

        System.out.println("string   : " + string);
        System.out.println("reversed : " + reversed);

        // Using StringBuilder 
        System.out.print("Using StringBuilder : ");
        System.out.print(new StringBuilder(string).reverse().toString());
    }

    private static String reverse(String s) {
        char[] arr = s.toCharArray();
        char[] reversedArray = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return new String(reversedArray);
    }
}