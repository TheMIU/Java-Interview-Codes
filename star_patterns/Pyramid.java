package star_patterns;

public class Pyramid {
    public static void main(String args[]) {
        int row = 5;
        // Outer loop work for rows
        for (int i = 0; i < row; i++) {
            // inner loop work for space
            for (int j = row - i; j > 1; j--) {
                // prints space between two stars
                System.out.print(" ");
            }
            // inner loop for columns
            for (int j = 0; j <= i; j++) {
                // prints star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
