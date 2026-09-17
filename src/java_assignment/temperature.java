package java_assignment;

import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Temperature Converter ---");
            System.out.print("Enter the temperature in Celsius (Type 'e' to exit): ");
            
            String input = sc.next();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                double celsius = Double.parseDouble(input);

                // Conversion formula
                double fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("\n========================================");
                System.out.println("Celsius Temperature    : " + celsius + " °C");
                System.out.println("Fahrenheit Temperature : " + fahrenheit + " °F");
                System.out.println("========================================");

            } catch (Exception ex) {
                System.out.println("Invalid input! Please enter a valid number or 'e'.");
                sc.nextLine(); // Clear the invalid input
            }
        }

        sc.close();
    }
}