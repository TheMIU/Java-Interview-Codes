import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number : ");
        int num = sc.nextInt();

        System.out.println("Factorial number is : " + findFactorial(num));
    }

    private static int findFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
