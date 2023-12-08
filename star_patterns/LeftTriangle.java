package star_patterns;

public class LeftTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int spaces = rows;

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < spaces; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }
}
