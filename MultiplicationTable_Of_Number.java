import java.util.Scanner;

public class MultiplicationTable_Of_Number {
    public static void main(String[] args) {
        // get number using scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number : ");
        int num = sc.nextInt();

        // print Multiplication Table
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // close scanner
        sc.close();
    }
}

// why close the Scanner ?
// over time by time, memory will full of objects.
// this will cause to crash programme, because out of memory
// (not affected in small programmes)