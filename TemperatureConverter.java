import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Temperature Conversion Tool:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1/2/3): ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = input.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitInput = input.nextDouble();
                    double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
                    System.out.println(fahrenheitInput + "°F is equal to " + celsiusOutput + "°C");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        } while (choice != 3);

        input.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}