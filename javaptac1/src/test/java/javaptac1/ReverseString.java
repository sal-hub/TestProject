package javaptac1;

public class ReverseString {

	public static void main(String[] args) {
		
	
			//ReverseString using CharcterArray.

			// declaring variable

			String stringinput = "Dallas";
		
			// convert String to character array

			// by using toCharArray

			char[] resultarray = stringinput.toCharArray();

			//iteration

			 for (int i = resultarray.length - 1; i >= 0; i--)

			// print reversed String

			 System.out.print(resultarray[i]);

		}			
	

}


 