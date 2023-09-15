import java.util.Scanner;
import Service.CalculatorService;

public class Application {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the world famous calculator app!");
            System.out.println("Choose one of the following operations:");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Exit");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting the calculator.");
                break;
            }

            System.out.print("Enter the first number:");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number:");
            double num2 = scanner.nextDouble();
        }
        scanner.close();
    }
}
