import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter first number: ");
        if (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
        } else {
            System.out.println("Error: not a double value.");
            return;
        }

        System.out.print("Enter second number: ");
        if (sc.hasNextDouble()) {
        
            num2 = sc.nextDouble();
        } else {
            System.out.println("Error: not a double value.");
            return;
        }

        double average = (num1 + num2) / 2;
        System.out.println("Average = " + average);
    }
}
