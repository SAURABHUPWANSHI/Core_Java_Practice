   //Declare an integer and check whether it is even or odd using modulus operator
   
   //and if-else statement.

        package java_assignment;

        import java.util.Scanner;

        public class EvenOdd {

	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		
		System.out.println("enter the integer");
		
		number = sc.nextInt();
		
		if (number % 2 == 0) {
		
		System.out.println("the number is even");
		
	    } else {
		
		System.out.println("the number is odd");
		
	    }
	}
}
	
	
	
