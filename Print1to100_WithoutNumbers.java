public class Print1to100_WithoutNumbers {
    public static void main(String[] args) {
        // print 1 to 100 without using numbers

        // 1. using string length
        // usingStringLength();

        // 2. using ASCII values (d = 100)
        usingASCII_Values();
    }

    // using Strings length
    public static void usingStringLength() {
        String s1 = "a";
        String s2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        for (int i = s1.length(); i <= s2.length(); i++) {
            System.out.println(i);
        }
    }

    // 2. using ASCII values (d = 100)
    private static void usingASCII_Values() {
        int start = 'd' / 'd';
        int end = 'd';

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}