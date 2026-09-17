package java_assignment;

import java.util.Scanner;

public class largestnumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Find the Largest Number ---");
            System.out.print("Enter the first number (Type 'e' to exit): ");
            String input = sc.next();
            
            if (input.equalsIgnoreCase("e")) {
                System.out.println("Exiting the program...");
                break;
            }
            
            try {
                int num1 = Integer.parseInt(input);
                
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                
                System.out.println("\nResult:");
                if (num1 > num2) {
                    System.out.println("Largest number is: " + num1);
                } else if (num2 > num1) {
                    System.out.println("Largest number is: " + num2);
                } else {
                    System.out.println("Both numbers are equal.");
                }
                
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter a valid integer or 'e'.");
            }
            
            System.out.println("-------------------------------");
        }
        
        sc.close();
    }
}