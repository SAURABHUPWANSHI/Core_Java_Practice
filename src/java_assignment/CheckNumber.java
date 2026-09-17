package java_assignment;

import java.util.Scanner;

public class CheckNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEnter a number (ya program band karne ke liye 9999 type karein):");
            int number = sc.nextInt(); 
            
            if (number == 9999) {
                System.out.println("Program band ho gaya.");
                break; 
            }
            
            if (number > 0) {
                System.out.println("The number is Positive.");
            } else if (number < 0) {
                System.out.println("The number is Negative.");
            } else {
                System.out.println("The number is Zero.");
            }
        }
        
        sc.close();
    }
}