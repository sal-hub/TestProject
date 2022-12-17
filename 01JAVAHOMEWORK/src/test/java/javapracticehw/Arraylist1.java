package javapracticehw;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		
		//ArrayList<String> cars= new ArrayList<String>();
		
		ArrayList<String> cars = new ArrayList<String>();
		//add the data
		
		cars.add("Nissan");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Mustang");
		cars.add("Camero");
	System.out.println(cars.add("Mercedece"));
	cars.get(1);
	cars.set(0,"Thunderbirds");
	System.out.println(cars.get(1));
	System.out.println();
	System.out.println(cars.set(0,"Thunderbirds"));
	cars.size();
	System.out.println(cars.size());
	//ArrayList<Integer> cars = new ArrayList<Integer>();
	
	System.out.println(cars);
	}
	}
	


