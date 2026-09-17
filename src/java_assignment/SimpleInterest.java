package java_assignment;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Simple Interest Calculator ---");
            System.out.print("Enter the principal amount (Type 'e' to exit): ");
            
            String input = sc.next();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                double principal = Double.parseDouble(input);

                System.out.print("Enter the rate of interest (%): ");
                double rate = sc.nextDouble();

                System.out.print("Enter the time in years: ");
                int time = sc.nextInt();

                double simpleInterest = (principal * rate * time) / 100;
                double totalAmount = principal + simpleInterest;

                System.out.println("\n==================================");
                System.out.println("Principal Amount : Rs. " + principal);
                System.out.println("Rate of Interest : " + rate + "%");
                System.out.println("Time Period      : " + time + " years");
                System.out.println("Simple Interest  : Rs. " + simpleInterest);
                System.out.println("Total Amount     : Rs. " + totalAmount);
                
                System.out.print("Status           : ");
                if (simpleInterest > 1000) {
                    System.out.println("Simple Interest is HIGH");
                } else {
                    System.out.println("Simple Interest is LOW");
                }
                System.out.println("==================================");

            } catch (Exception ex) {
                System.out.println("Invalid input! Please enter a valid number or 'e'.");
                sc.nextLine(); 
            }
        }

        sc.close();
    }
}