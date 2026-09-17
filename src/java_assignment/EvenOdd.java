package java_assignment;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
        sc.close();
    }
}