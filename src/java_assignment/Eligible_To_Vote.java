  //Declare age (int) and check whether a person is eligible to vote 

  //using if-else statement

    package java_assignment;

    import java.util.Scanner;

    public class Eligible_To_Vote {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int age;
	
	System.out.println("enter the age");
	
	age = sc.nextInt();
	
	if (age >= 18) {
		
	 System.out.println("person is eligible to vote");
	} else 
			
	System.out.println("person is not eligible to vote");
	
	}
}
	
