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

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Invalid input, please enter a number in digit form.");
                scanner.nextLine(); // Takes in invalid input
                continue;
            }

            if (choice > 5 || choice < 0) {
                System.out.println("ERROR: Please input a digit between 1 - 5.");
                scanner.nextLine(); // Takes in invalid input
                continue;
            }

            if (choice == 5) {
                System.out.println("Exiting the calculator.");
                break;
            }

            System.out.print("Enter the first number:");
            double num1;

            try {
                num1 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid number.");
                scanner.nextLine(); // Takes in invalid input
                continue;
            }

            System.out.print("Enter the second number:");
            double num2;

            try {
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid number.");
                scanner.nextLine(); // Takes in invalid input
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
                    if (num2 != 0) {
                        result = calculator.divide(num1, num2);
                    } else {
                        System.out.println("Error: Division by zero");
                        continue; // Go back to menu
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose an input between 1 - 5.");
                    continue; // Go back to menu
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
