package java_assignment;

import java.util.Scanner;

public class swap_values_without_using_third_variable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Swap Values Without Third Variable ---");
            System.out.print("Enter the first number 'a' (Type 'e' to exit): ");
            
            String input = sc.next();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                int a = Integer.parseInt(input);

                System.out.print("Enter the second number 'b': ");
                int b = sc.nextInt();

                System.out.println("\n----------------------------------------");
                System.out.println("BEFORE SWAPPING:");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                
                // Swapping logic
                a = a + b;
                b = a - b;
                a = a - b;

                System.out.println("\nAFTER SWAPPING:");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("----------------------------------------");

            } catch (Exception ex) {
                System.out.println("Invalid input! Please enter a valid integer or 'e'.");
                sc.nextLine(); // clear the invalid input
            }
        }

        sc.close();
    }
}