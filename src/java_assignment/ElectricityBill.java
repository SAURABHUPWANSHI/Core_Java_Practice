package java_assignment;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n========================================");
            System.out.println("      ELECTRICITY BILLING SYSTEM      ");
            System.out.println("========================================");
            System.out.print("Enter the units consumed (Type -1 to exit): ");
            
            int units = sc.nextInt();
            
            if (units == -1) {
                System.out.println("Thank you for using the system. Exiting...");
                break;
            }
            
            if (units < 0) {
                System.out.println("Error: Units cannot be negative. Please try again.");
                continue;
            }
            
            double bill = 0.0;
            
            System.out.println("\n----------------------------------------");
            System.out.println("             BILL BREAKDOWN             ");
            System.out.println("----------------------------------------");
            
            if (units <= 100) {
                bill = units * 5.0;
                System.out.println("Slab 1 (0-100 units)   : " + units + " units @ Rs. 5.00  = Rs. " + bill);
            } 
            else if (units <= 200) {
                double slab1 = 100 * 5.0;
                double slab2 = (units - 100) * 7.0;
                bill = slab1 + slab2;
                
                System.out.println("Slab 1 (0-100 units)   : 100 units @ Rs. 5.00 = Rs. " + slab1);
                System.out.println("Slab 2 (101-200 units) : " + (units - 100) + " units @ Rs. 7.00 = Rs. " + slab2);
            } 
            else {
                double slab1 = 100 * 5.0;
                double slab2 = 100 * 7.0;
                double slab3 = (units - 200) * 10.0;
                bill = slab1 + slab2 + slab3;
                
                System.out.println("Slab 1 (0-100 units)   : 100 units @ Rs. 5.00 = Rs. " + slab1);
                System.out.println("Slab 2 (101-200 units) : 100 units @ Rs. 7.00 = Rs. " + slab2);
                System.out.println("Slab 3 (Above 200)     : " + (units - 200) + " units @ Rs. 10.00 = Rs. " + slab3);
            }
            
            System.out.println("----------------------------------------");
            System.out.println("Total Units Consumed   : " + units);
            System.out.println("Total Amount Due       : Rs. " + bill);
            System.out.println("========================================");
        }
        
        sc.close();
    }
}