package javaptac1;

public class reverseNumber {

public static void main(String[] args) {

	/*
	int number = 123456, reverse = 0;  
	//we have not mentioned the initialization part of the for loop  
	for( ;number != 0; number=number/10)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	}  
	System.out.println("The reverse of the given number is: " + reverse); 
	
}
	
} 
		
*/

	int num=123456;
		//Using StringBuffer class
		StringBuffer obj= new StringBuffer(String.valueOf(num));
		StringBuffer rev=obj.reverse();
		System.out.println("Reverse Number:"+rev);
}
}
	
 //n != 0 means the while loop will execute till the number not become 0 
//so it goes like this ex:- n =123 So n != 0 Goes in loop 123%10=3 
//It goes in sum = 0+3 =3
//Now 123/10=12 Now new number is n =12 Now 12 != 0 
//so Goes in loop again 12%10=2 Sum =3+2=5 
//Then 12 / 10= 1 Now n=1 So 1 !=0 So 1%10= 1 
//Then Sum = 5+1 =6 And 1/ 



 
