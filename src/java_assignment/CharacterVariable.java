package java_assignment;

import java.util.Scanner;

public class CharacterVariable {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a character (Type 'q' to exit): ");
            char myChar = sc.next().charAt(0);
            
            if (myChar == 'q' || myChar == 'Q') {
                System.out.println("Exiting the program...");
                break;
            }
            
            char lowerChar = Character.toLowerCase(myChar);
            
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                System.out.println("Result: You entered a VOWEL.");
            } else if (Character.isLetter(myChar)) {
                System.out.println("Result: You entered a CONSONANT.");
            } else if (Character.isDigit(myChar)) {
                System.out.println("Result: You entered a NUMBER.");
            } else {
                System.out.println("Result: You entered a SPECIAL CHARACTER.");
            }
            
            System.out.println("-------------------------");
        }
        
        sc.close();
    }
}