public class Palindrome {
    public static void main(String[] args) {
        System.out.println("'madam' is Palindrome : " + checkPalindrome("madam")); // true
        System.out.println("'john' is Palindrome : " + checkPalindrome("john")); // false
    }

    private static boolean checkPalindrome(String text) {
        String original = text.toUpperCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        return original.equals(reversed) ? true : false;
    }
}