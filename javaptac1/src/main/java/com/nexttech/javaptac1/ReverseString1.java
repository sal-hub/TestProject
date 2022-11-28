package com.nexttech.javaptac1;


	public class ReverseString1 {
	 
//ReverseString using StringBuilder.

		public static void main(String[] arg) {

		// declaring variable

		  String input = " I eat Apple";

		  // creating StringBuilder object

		  StringBuilder stringBuildervarible = new StringBuilder();

		    // append a string into StringBuilder stringBuildervarible &append is inbuilt method

		  stringBuildervarible.append(input);

		     // reverse is inbuilt method in StringBuilder to use reverse the string 

		 stringBuildervarible.reverse();
             
		  System.out.println( "Reversed String  : " +stringBuildervarible);
		   
		}
	}
		    
