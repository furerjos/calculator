import java.util.InputMismatchException;
import java.util.Scanner;
import Service.CalculatorService;

public class Application {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the world-famous calculator app!");
            System.out.println("In order to use the calculator app, expect to " +
                    "input one number at a time after choosing your operation.");

            System.out.println("Choose one of the following operations:");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Exit");

            int choice;
            double num1;
            double num2;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Invalid input, please enter a number in digit form.");
                scanner.nextLine(); // Takes in invalid input
                continue;
            }

            if (choice > 5 || choice <= 0) {
                System.out.println("ERROR: Please input a digit between 1 - 5.");
                scanner.nextLine(); // Takes in invalid input
                continue;
            } else if (choice == 5) {
                System.out.println("Exiting the calculator.");
                break;
            }

            try {
                System.out.print("Enter the first number:");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number:");
                num2 = scanner.nextDouble();
            } catch(InputMismatchException e) {
                System.out.println("Invalid Input: Input must be a number!");
                System.out.println(e);
                scanner.nextLine();
                continue;
            }

            double result;

            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    try {
                        result = calculator.divide(num1, num2);
                    } catch(Exception e) {
                        System.out.println(e);
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
