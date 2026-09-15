package java_assignment;

import java.util.Scanner;

public class percentage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Discount Calculator ---");
            System.out.print("Enter the price (Type 'e' to exit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                double price = Double.parseDouble(input);

                System.out.print("Enter the discount percentage: ");
                double discount = sc.nextDouble();

                double finalPrice = price - (price * discount / 100);

                System.out.println("\nResult:");
                System.out.println("Original Price: Rs. " + price);
                System.out.println("Discount: " + discount + "%");
                System.out.println("Final Price: Rs. " + finalPrice);
                System.out.println("---------------------------");

            } catch (Exception ex) {
                System.out.println("Invalid input! Please enter a valid number or 'e'.");
                sc.nextLine(); 
            }
        }

        sc.close();
    }
}