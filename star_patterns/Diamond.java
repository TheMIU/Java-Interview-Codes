package star_patterns;

public class Diamond {
    public static void main(String[] args) {
        int row = 5;
        int space = row - 1;

        for (int j = 1; j <= row; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        space = 1;

        for (int j = 1; j <= row - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
