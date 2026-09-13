   //Declare temperature in Celsius (double) and 

   //convert it to Fahrenheit using the formula ( F = (C × 9/5) + 32 ).



       package java_assignment;

       import java.util.Scanner;

       public class temperature{

       public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);

	   double temperatureincelsius;
	 
	   double converttoFahrenheit;
	
	   System.out.println("enter the temperatureincelsius:");
	
	   temperatureincelsius = sc.nextDouble();
	
	   converttoFahrenheit = (temperatureincelsius * 9 / 5) + 32;
	
	   System.out.println();
	   
	   System.out.println("temperatureinfahrenheit=" );
	   
	   System.out.println(converttoFahrenheit);
       
      }
      
}
	
	

