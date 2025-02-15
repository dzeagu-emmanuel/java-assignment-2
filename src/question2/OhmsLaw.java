package question2;

import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the known parameters (V for Voltage, I for Current, R for Resistance):");
        System.out.println("Enter '?' for the unknown parameter.");

        System.out.print("Voltage (V): ");
        String voltageInput = scanner.next();
        double voltage = voltageInput.equals("?") ? Double.NaN : Double.parseDouble(voltageInput);

        System.out.print("Current (I): ");
        String currentInput = scanner.next();
        double current = currentInput.equals("?") ? Double.NaN : Double.parseDouble(currentInput);

        System.out.print("Resistance (R): ");
        String resistanceInput = scanner.next();
        double resistance = resistanceInput.equals("?") ? Double.NaN : Double.parseDouble(resistanceInput);

        if (Double.isNaN(voltage)) {
            voltage = current * resistance;
            System.out.println("Calculated Voltage: " + voltage + "V");
        } else if (Double.isNaN(current)) {
            current = voltage / resistance;
            System.out.println("Calculated Current: " + current + "A");
        } else if (Double.isNaN(resistance)) {
            resistance = voltage / current;
            System.out.println("Calculated Resistance: " + resistance + "Ω");
        } else {
            System.out.println("No unknown parameter provided.");
        }

        scanner.close();
    }
}
