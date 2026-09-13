   //Declare length and width as double variables and 

   //calculate the area of a rectangle using arithmetic operators.



      package java_assignment;
//
//    public class areaofrectangle {
//	
//	  public static  void main(String [] args) {
//		
//	  double  length = 12.56;
//		
//	  double width = 13.89;
//		
//	  double area = length* width;
//		
//	  System.out.println("area of rectangle="+ area);
//		
//		}
//	}
 
      
      
      
//     USER INPUT


        import java.util.Scanner;

        public class areaofrectangle{
	
	    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double length, width, area;
		
		System.out.println("enter the length:");
		
		length= sc.nextDouble();
		
		System.out.println("enter the width:");
		
		width = sc.nextDouble();
		
		area = length * width;
		
		System.out.println("area of rectnagle="+  area);	
	}
	
}	
	
	

















