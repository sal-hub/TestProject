package javaptac1;

public class javacode_Interview {

	public static void main(String[] args) {
		
		
		//  Adding natural numbers upto given digit
		{  
			int i, num = 10, sum = 0;  
			//executes until the condition returns true  
			for(i = 1; i <= num; ++i)  
			{  
			//adding the value of i into sum variable  
			sum = sum + i;  
			}  
			//prints the sum   
			System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
			}  
		
		
	}
		/*//  finding factorial
		public void factorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
		fact = fact * i;
		}
		System.out.println("Factorial of " + a + " is :" + fact);
		}
		// 3. Reversing String
		public void reverseString(String str) {
		String a = str;
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
		reverse = reverse + a.charAt(i);
		}
		System.out.println(reverse + " is the reverse of " + a);
		}
		// 4. Reversing a number
		public void reverseNumber(int a) {
		int num = a;
		int reverse = 0;
		while (num != 0) {
		reverse = reverse * 10 + num % 10;
		num /= 10;
		}
		System.out.println(reverse + " is the reverse of a number " + a);
		}
		
		// 5. Checking Palindrome
		public void checkAnagram(String a) {
		String b = a;
		String rev = "";
		for (int i = b.length() - 1; i >= 0; i--) {
		rev = rev + b.charAt(i);
		}
		if (a.equals(rev)) {
		System.out.println(a + " is an Anagram");
		} else {
		System.out.println(a + " is not an anagram");
		}
		}
		// 6. Writing a fibonacci series
		public void fibonacciSeries(int a) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
		int sum;
		for (int i = 2; i < a; i++) {
		sum = num1 + num2;
		num1 = num2;
		num2 = sum;
		System.out.print(sum + " ");
		}
		System.out.println();
		}
		// 7. Swaping two numbers
		public void swapNumbers(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swaping: " + "num1 is: " + num1 + " num2 is: " + num2);
		}
		// 8. Check Armstrong Number
		public void checkArmstrong(int a) {
		int num1 = a;
		int total = 0;
		int temp;
		while (num1 != 0) {
		temp = num1 % 10;
		total = total + temp * temp * temp;
		num1 = num1 / 10;
		}
		if (a == total) {
		System.out.println(a + " is an armstrong number");
		} else {
		System.out.println(a + " is not an armstrong number");
		}
		}
		// 8. Check prime number or not a prime number
		public void checkPrime(int a) {
		int num = a;
		boolean flag = false;
		if (num <= 0) {
		flag = true;
		}
		for (int i = 2; i <= num / 2; ++i) {
		// condition for non-prime number
		if (num % i == 0) {
		flag = true;
		break;
		}
		}
		if (!flag)
		System.out.println(num + " is a prime number.");
		else
		System.out.println(num + " is not a prime number.");
		}
		// 9. Find minimum and maximum of an array
		public void checkMinMax(int[] a) {
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
		// finding minimum
		if (min > a[i]) {
		min = a[i];
		}
		// finding maximum
		if (max < a[i]) {
		max = a[i];
		}
		}
		System.out.println("Minimum in the given array is: " + min);
		System.out.println("maximum in the given array is: " + max);
		}
		// 10. Summing the elements of an array
		public void sumArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
		}
		System.out.println("The sum of given array is: " + sum);
		}
		// 11. check even/ odd numbers
		public void checkEvenOdd(int a) {
		if (a % 2 == 0)
		System.out.println(a + " is an even number ");
		else
		System.out.println(a + " is an Odd numver");
		}
		// 12. Sum of Even numbers
		public void sumEven(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i = i + 2) {
		sum = sum + i;
		}
		System.out.println("The Even sum upto " + a + " is: " + sum);
		}
		// 13. Sum of Odd Numbers
		public void sumOdd(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i = i + 2) {
		sum = sum + i;
		}
		System.out.println("The Odd sum upto " + a + " is: " + sum);
		}
		// 14. multiplication of natural numbers
		public void multiplication(int a) {
		Quality is everyone’s responsibility CONFIDENTIAL 2021 NextTech ITC. All rights reserved
		int multi = 1;
		for (int i = 1; i <= a; i++) {
		multi = multi * i;
		}
		System.out.println("Multiplication of 1 to " + a + " is: " + multi);
		}
		// 15. swaping two strings : mohan + shyam = mohanshyam
		public void swapString(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Value of str1: " + str1 + " value of str2: " + str2);
		}
		// 16. printing elements of an array
		public void printArrayElement(int[] a) {
		for (int b : a) {
		System.out.print(b + " ");
		}
		System.out.println();
		}
		// 17. converting String to integer
		public void StringToInt(String a, int i) {
		Integer.parseInt(a);
		System.out.println("The value of integer is: " + (Integer.parseInt(a) + i));
		}
			}

}
		*/
		
public void StringToInt(String a, int i) {
Integer.parseInt(a);
System.out.println("The value of integer is: " + (Integer.parseInt(a) + i));
}}	
		
		

