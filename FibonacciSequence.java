import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want ? : ");
        int count = sc.nextInt();

        printFibonacciSequence(count);
        sc.close();
    }

    private static void printFibonacciSequence(int count) {
        int first = 0, second = 1;
        System.out.print("First " + count + " Numbers of Fibonacci Sequence: ");
        for (int i = 0; i < count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
