package com.nexttech.javaptac1;

public class ReverseString2 {
	
	public static void main(String[] args) {
// Java program to reverse a string using While loop

		 String stringInput = "App";   

		    //Get the String length

		    int iStrLength=stringInput.length();     
           
		    System.out.println(iStrLength);
		    //Using While loop

		    while(iStrLength >0)

		{

		System.out.print(stringInput.charAt(iStrLength -1)); 
		iStrLength--;
		

		}
    }
}


