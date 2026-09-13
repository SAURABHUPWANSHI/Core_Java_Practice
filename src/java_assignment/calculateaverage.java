   //Declare three subject marks (int) and 
  
   //calculate the total and average using arithmetic operators.


        package java_assignment;

        import java.util.Scanner;

        public class calculateaverage {
	
	    static double average;

	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hindi, maths, english;
		
		System.out.println("enter the marks in hindi");
		hindi = sc.nextDouble();
		
		System.out.println("enter the marks in maths");
		maths = sc.nextDouble();
		
		System.out.println("enter the marks in english");
		english = sc.nextDouble();
		
		average=(hindi+maths+english)/3;
		
		System.out.println("average =");
		
		System.out.println(average);
		
	}

}
