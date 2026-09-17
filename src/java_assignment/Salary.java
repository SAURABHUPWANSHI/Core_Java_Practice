package java_assignment;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Salary & Bonus Calculator ---");
            System.out.println("Bonus Rules:");
            System.out.println("- Basic Salary >= 50000 : 20% Bonus");
            System.out.println("- Basic Salary >= 30000 : 10% Bonus");
            System.out.println("- Basic Salary < 30000  : 5% Bonus");
            System.out.print("\nEnter the Basic Salary (Type 'e' to exit): ");
            
            String input = sc.next();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }

            try {
                double basicSalary = Double.parseDouble(input);
                double bonus = 0.0;
                int bonusPercentage = 0;

                if (basicSalary >= 50000) {
                    bonus = basicSalary * 0.20;
                    bonusPercentage = 20;
                } else if (basicSalary >= 30000) {
                    bonus = basicSalary * 0.10;
                    bonusPercentage = 10;
                } else {
                    bonus = basicSalary * 0.05;
                    bonusPercentage = 5;
                }

                double finalSalary = basicSalary + bonus;

                System.out.println("\n===========================");
                System.out.println("Basic Salary   : Rs. " + basicSalary);
                System.out.println("Bonus Applied  : " + bonusPercentage + "%");
                System.out.println("Bonus Amount   : Rs. " + bonus);
                System.out.println("Final Salary   : Rs. " + finalSalary);
                System.out.println("===========================");

            } catch (Exception ex) {
                System.out.println("Invalid input! Please enter a valid number or 'e'.");
            }
        }

        sc.close();
    }
}