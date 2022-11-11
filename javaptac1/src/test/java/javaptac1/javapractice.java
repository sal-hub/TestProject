package javaptac1;

import java.util.ArrayList;
import java.util.HashMap;

public class javapractice {

	public static void main(String[] args) {
		int a=80;
		int b=20;
		 int m = a+b;
		//double h=10.5, 
		 double g=20.5;
		 char ab='F';
		System.out.println(ab);
		System.out.println(m);
		String d="Dhaka";
		System.out.println(d);
		System.out.println(a+g);
		System.out.println(a-b);
	
	//WhenI want to print anything again & again, we use Forloop
		for(int i=0;i<=10;i=i+3) {
			System.out.println(i);
		
		//a<10, then we to print a is a smaller number
			//a=10 then a is a number
			int z=10; 
			
			if(z<10) {
				System.out.println("z is a smaller number");
			}
		
			else if(z>10) {System.out.println("z is a big number");
			}
		    else {
		    
		    
			System.out.println("z is a number");}
	//array
			String[] car= {"Nissan","BMW","Toyota"};
		    car[2]="Kia";
		    System.out.println(car[1]);
		
		    ArrayList<String> cars=new ArrayList<String>();
		    cars.add("tesla");
		    cars.add("bently");
		    //cars.remove(0);
		    //cars.add("Tesla);
		    System.out.println(cars.get(1));
		
		HashMap<String,String>number=new HashMap<String,String>();
		number.put("G", "20");
		number.put("N", "25");
		number.put("T", "35");
		System.out.println(number.get("T"));
		
		
	
		
		
		
		
		
	}
	}
}

		
		
		
	


