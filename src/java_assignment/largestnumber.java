    //Declare two integers and print the largest number using relational operators and

    // if-else statement.

package java_assignment;

import java.util.Scanner;

public class largestnumber {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1;
		
		int num2;
		
		System.out.println("enter the num1");
		
		 num1 = sc.nextInt();
		
		System.out.println("enter the num2");
		
		 num2 = sc.nextInt();
		
		if (num1>num2) {
		
		System.out.println("largest number is:"+ num1);
		
		} else if (num2> num1) {
			
			System.out.println("largest number is:" + num2);
			
		} else {
			
			System.out.println("both number are equal");
			
		}
	}
		
}
		
		

