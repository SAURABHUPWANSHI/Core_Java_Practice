//Declare basic salary (double) and calculate final salary 

//after adding bonus based on given condition.

        package java_assignment;

        import java.util.Scanner;

        public class Salary {

	    public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double BasicSalary;
		
		double Bonus;
		
		double FinalSalary;
				
		System.out.println("Enter the BasicSalary");
		
		BasicSalary = sc. nextDouble();
		
		if (BasicSalary >= 50000) {
		
		Bonus = BasicSalary * 0.20;
		
	    } else if (BasicSalary>= 30000) {
		
		Bonus = BasicSalary * 0.10;
		
	    } else {
	    	
		Bonus = ( BasicSalary * 0.05);
		
	}
		FinalSalary = BasicSalary + Bonus;
		
		System.out.println("BasicSalary=" + BasicSalary );
		
		System.out.println("Bonus="+ Bonus);
		
		System.out.println("FinalSalary="+ FinalSalary);	
	}
}
