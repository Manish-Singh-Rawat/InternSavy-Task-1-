interface Calculator {
    double add(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);
}

class BasicCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // Not-a-Number
        }
        return a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
