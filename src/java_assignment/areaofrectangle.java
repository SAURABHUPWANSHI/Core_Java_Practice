package java_assignment;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double length, width, area;
        
        System.out.println("enter the length:");
        length = sc.nextDouble();
        
        System.out.println("enter the width:"); 
        width = sc.nextDouble();
        
        area = length * width;
        
        System.out.println("area of rectnagle=" + area);    
    }
}