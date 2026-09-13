       // Declare product price and discount percentage (double) and
       
       //calculate the final price after applying the discount.



       package java_assignment;

        import java.util.Scanner;

        public class percentage {
	
	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the price");
		
		double price = sc.nextDouble();
		
	    System.out.println("enter the discount percentage");
	
	    double discount= sc.nextDouble();
	
	    double Finalprice = price - (price * discount/100);
	
	    System.out.println("Finalprice=" + Finalprice);
	}
   }
	
	
	
		
		
	
		
		
		
