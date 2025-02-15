package question4;

import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Voltage (V): ");
        double voltage = scanner.nextDouble();

        System.out.print("Enter Back EMF (V): ");
        double backEMF = scanner.nextDouble();

        System.out.print("Enter Motor Constant (K): ");
        double motorConstant = scanner.nextDouble();

        if (motorConstant <= 0) {
            System.out.println("Motor Constant must be positive.");
        } else {
            double speed = (voltage - backEMF) / motorConstant;
            System.out.println("Calculated Speed: " + speed + " RPM");
        }

        scanner.close();
    }
}
