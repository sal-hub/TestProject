package javapracticehw;

import java.util.ArrayList;
import java.util.Arrays;

public class Homepractice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String []Fruits = {"Mango", "Watermeloon","Orange", "apple"};
System.out.println(Fruits[3]);
Fruits[0]="Banana";
System.out.println(Fruits[0]);
	System.out.println(Fruits.length);
//ArrayList
	
	
	String [] Cars1 = {"Nissan", "Camero", "Thunderbird", "BMW"};
	ArrayList<String> cars1= new ArrayList<String>();
	cars1.add("Nissan");
	cars1.add("Camero");
	cars1.add("Thunderbird");
	cars1.add("BMW");
	String[] carflowers= {"Lili", "Rose","nightqueen","f4"};
	cars1.get(0);
	System.out.println(cars1.get(0));
	
	Integer[] numbers = {1,2,3,4,5,6};
	
	 //carflowers[2];
	System.out.println(carflowers[2]);
	System.out.println(Cars1[1]);
	System.out.println(Arrays.toString(numbers));
	//length of array
	System.out.println(numbers.length);
	
}
	
	
}

