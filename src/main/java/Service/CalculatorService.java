package Service;

public class CalculatorService {
    /**
     * Default constructor.
     */
    public CalculatorService() {

    }

    /**
     * Adds two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The difference of the two numbers.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of the two numbers multiplied together.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of the two numbers divided.
     */
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }
}
