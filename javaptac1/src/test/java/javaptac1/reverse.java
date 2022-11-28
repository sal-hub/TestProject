package javaptac1;

public class reverse {

	public static void main(String[] args) {
		// Java program to reverse a number recursively
		 
		int number =  356789, reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("Reversed Number is: " + reverse); 
		
	}
		 
}
	
		      
		 
		//Output: Reversed Number is 987653

	

