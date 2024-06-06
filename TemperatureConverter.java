import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char unit = scanner.next().charAt(0);

        switch (Character.toUpperCase(unit)) {
            case 'C':
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 'F':
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
                System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case 'K':
                System.out.println("Temperature in Celsius: " + kelvinToCelsius(temperature));
                System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter C, F, or K.");
                break;
        }
        
        scanner.close();
    }
}
