package com.nexttech.javaptac1;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {

		
		       int x, t;// x and y are to swap   
			    int y;
		       Scanner sc = new Scanner(System.in);  
		       System.out.println("Enter the value of X and Y");  
		       x = sc.nextInt();  
		       y = sc.nextInt();  
		       System.out.println("before swapping numbers: "+x +"  "+ y);  
		       /*swapping */  
		       t = x;  // t=x=2
		       x = y;  //x=6
		       y = t;  //y=2
		       System.out.println("After swapping: "+x +"   " + y);  
		       System.out.println( );  
		       
	}
}