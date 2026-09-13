     // Declare student name (String) and marks (int);
   
     //print “Pass” if marks ≥ 40, otherwise print “Fail”.


       package java_assignment;

       import java.util.Scanner;

       public class studentresult {

	   public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
		
	   String studentname;
		
	   int marks;
		
       System.out.println("enter the studentname");
	   studentname = sc.nextLine();
		
	   System.out.println("enter the marks");
	   marks = sc.nextInt();
		
	   if (marks >= 40){
			 
	   System.out.println("Pass");
			 
	   } else {
			 
	   System.out.println("Fail");
			 
       }
		 	 
	}
}
