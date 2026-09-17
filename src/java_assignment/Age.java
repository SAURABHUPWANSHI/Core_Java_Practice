package java_assignment;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age;
        
        while (true) {
            System.out.println("enter the age :");
            age = sc.nextInt();
            
            // Agar aap 0 daloge toh program band ho jayega
            if (age == 0) {
                System.out.println( "Program terminated.");
                break; 
            }
            
            if (age < 13) {
                System.out.println("Child");
            } else if (age < 18) {
                System.out.println("Teenager");
            } else {
                System.out.println("Adult");
            }
            System.out.println("-----------------------");
        }
    }
}