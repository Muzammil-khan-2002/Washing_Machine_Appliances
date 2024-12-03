import java.util.Scanner;


abstract class Appliances {
    String brand;
    double power;

    // Constructor to initialize brand and power
    Appliances(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }

    // Abstract method to be implemented by subclasses
    abstract void turnOn();
}

// Concrete subclass WashingMachine that extends Appliances
class WashingMachine extends Appliances {
    int capacity;

    // Constructor to initialize brand, power, and capacity
    WashingMachine(String brand, double power, int capacity) {
        super(brand, power); // Calling the superclass constructor
        this.capacity = capacity;
    }

    // Implementation of the turnOn() method
    @Override
    void turnOn() {
        System.out.println("The washing machine of brand " + brand + " with capacity " + capacity + " kg is now on.");
    }
}

// Main class to test the WashingMachine functionality
public class MainAppliancesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs for washing machine details
        System.out.print("Enter the brand of the washing machine: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the power (in watts) of the washing machine: ");
        double power = scanner.nextDouble();

        System.out.print("Enter the capacity (in kg) of the washing machine: ");
        int capacity = scanner.nextInt();

        // Create an instance of WashingMachine with user inputs
        WashingMachine wm = new WashingMachine(brand, power, capacity);

        // Call the turnOn method
        wm.turnOn();

        scanner.close(); // Close the scanner
    }
}
