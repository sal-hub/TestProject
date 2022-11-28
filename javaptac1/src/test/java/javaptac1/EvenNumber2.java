package javaptac1;

import java.util.Scanner;

public class EvenNumber2 {

	public static void main(String[] args) {
	
		
			//
			Scanner input = new Scanner(System.in);
			int sum = 0;
			int m,n;
			
			
			System.out.println("Enter initial Number:  "   );
			m = input.nextInt();
			
			
			
			//for   ctrl c then ctrl v for pest 
			System.out.println("Enter final Number:"   );
			
			
			n = input.nextInt();
			
			for(int i = m; i <=  n; i++)
			{
				if(i%2 ==  0)
				
					sum = sum  +  i;	
			System.out.print(" "  + i  );
			}
			{
				System.out.println();	
			System.out.println(" The sum is    :  "      +   sum);	//we add m +n = 
			}
			
		
		}

		}
	
