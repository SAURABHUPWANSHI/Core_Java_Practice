 // Declare two integer variables and 
 
 //swap their values without using a third variable (use arithmetic operators only).



        package java_assignment;

        import java.util.Scanner;

        public class swap_values_without_using_third_variable {
	
	    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a,b;
		
		System.out.println("enter the first number:");

		a = sc.nextInt();
		
		System.out.println("enter the second number:");
		
		b = sc.nextInt();
		
		System.out.println("before swapping");
		
		System.out.println("a =" +a);
		
		System.out.println("b = " +b);
		
		a = a+b;
		
		b= a-b;
		
		a = a-b;
		
		System.out.println("after swapping");
		
		System.out.println("a = " + a);
		
		System.out.println("b = " + b);
		
	}
}
		
		
				
		
		
	
	
	
	
	
	

