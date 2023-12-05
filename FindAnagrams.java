import java.util.Arrays;
import java.util.Scanner;

public class FindAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        String string1 = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String string2 = sc.nextLine();

        boolean isAnagram = checkAnagram(string1, string2);
        System.out.println(string1 + " & " + string2 + " are " + (isAnagram ? "Anagrams" : "not Anagrams"));

        sc.close();
    }

    private static boolean checkAnagram(String string1, String string2) {
        // if lengths are different not anagrams
        if (string1.length() != string2.length()) {
            return false;
        }

        if (string1.equals(string2)) {
            System.out.println("Same words !");
            return false;
        }

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
