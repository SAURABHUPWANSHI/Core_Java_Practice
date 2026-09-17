package Core_Java_Practice;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SwitchCaseCalculator {

    public static long calculateFactorial(int n) {
        if (n < 0 || n > 20) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int original = n, sum = 0, digits = String.valueOf(n).length();
        int temp = n;
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == original;
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n, reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        return original == reverse;
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        int temp = Math.abs(n);
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        return n < 0 ? -reverse : reverse;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        int temp = Math.abs(n);
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputVal = -1;

        while (true) {
            System.out.print("\nEnter ANY number from 1 to 1000 to analyze (or 0 to exit): ");
            try {
                inputVal = sc.nextDouble();
                
                if (inputVal == 0) {
                    System.out.println("System Shutdown Successfully.");
                    break;
                }

                System.out.println("=======================================================");
                System.out.println("             FULL ANALYSIS FOR NUMBER: " + inputVal);
                System.out.println("=======================================================");
                
                System.out.println("Square Value     : " + Math.pow(inputVal, 2));
                System.out.println("Cube Value       : " + Math.pow(inputVal, 3));
                System.out.println("Square Root      : " + Math.sqrt(inputVal));
                System.out.println("Cube Root        : " + Math.cbrt(inputVal));
                System.out.println("Log (Base e)     : " + Math.log(inputVal));
                System.out.println("Log10 (Base 10)  : " + Math.log10(inputVal));
                System.out.println("Absolute Value   : " + Math.abs(inputVal));
                
                if (inputVal == (int) inputVal) {
                    int intVal = (int) inputVal;
                    
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Even or Odd      : " + (intVal % 2 == 0 ? "Even" : "Odd"));
                    System.out.println("Is Prime Number? : " + isPrime(intVal));
                    System.out.println("Is Armstrong?    : " + isArmstrong(intVal));
                    System.out.println("Is Palindrome?   : " + isPalindrome(intVal));
                    System.out.println("Is Perfect No.?  : " + isPerfectNumber(intVal));
                    System.out.println("Sum of Digits    : " + sumOfDigits(intVal));
                    System.out.println("Reversed Number  : " + reverseNumber(intVal));
                    
                    long fact = calculateFactorial(intVal);
                    if (fact != -1) {
                        System.out.println("Factorial (n!)   : " + fact);
                    } else {
                        System.out.println("Factorial (n!)   : Number too large for factorial");
                    }

                    System.out.println("-------------------------------------------------------");
                    System.out.println("Binary Format    : " + Integer.toBinaryString(intVal));
                    System.out.println("Octal Format     : " + Integer.toOctalString(intVal));
                    System.out.println("Hex Format       : " + Integer.toHexString(intVal).toUpperCase());
                }
                System.out.println("=======================================================");

            } catch (InputMismatchException e) {
                System.out.println("Error: Numeric input required. Please try again.");
                sc.nextLine(); 
            }
        }
        sc.close();
    }
}