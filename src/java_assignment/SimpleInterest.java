  //Declare principal (double), rate (double), and time (int); 
  
  //calculate simple interest and display whether it is high or low based on value.


        package java_assignment;

        import java.util.Scanner;

        public class SimpleInterest{
	
	    public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double principal, simpleinterest;
		
		double rate;
		
		int time;
		
		System.out.println("enter the principal amount");
		
		principal = sc.nextDouble();
		
		System.out.println("enter the rate of interest");
		
		rate = sc.nextDouble();
		
		System.out.println("enter the time in years");
		
		time = sc.nextInt();
		
		double SimpleInterest = ( (principal* rate * time /100));
		
		System.out.println("SimpleInterest="+ SimpleInterest);
		
		if (SimpleInterest>1000) {
			
		System.out.println("Simple Interest is high");
			
		} else {
			
		System.out.println("Simple Interest is low");
				
		}
    }
	
}