import java.util.Scanner;

public class SalaryCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input salary : ");
        double salary = sc.nextDouble();

        if (salary > 10000) {
            double taxAmount = (salary * 10) / 100;
            System.out.println("Tax amount : " + taxAmount);
            System.out.println("Final salary : " + (salary - taxAmount));
        } else {
            System.out.println(salary + " amount is not tax dedicated.");
        }

        sc.close();
    }
}
