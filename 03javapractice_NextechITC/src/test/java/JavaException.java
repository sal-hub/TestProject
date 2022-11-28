import java.util.Arrays;

public class JavaException {

	public static void main(String[] args) {
		try {
		//store single-data or value in single variable
String [] flowers= {"Rose", "Lili"};
// Arrays -where we store multiple data or value in single variables
// String [] car ; DATATYPE[] VARIABLE={"DATA1","DATA2", DATA3}
// In Array we store in index, index starts from 0
String [] Car = {"Nissain","Toyota","BMW"};
//store 4 flowers name in flowers variable
		String [] flowers1 = {"Jasmine","Rose", "Daisy", "Sunflower"};
		String [] carflowers = {"Jasmine","Rose", "F4"};
 //store 1 to 5 by using Arrays
		int [] number= {1,2,3,4,5};
// access data
 // carFlower[0];
  System.out.println(carflowers[0]);
  System.out.println(carflowers[1]);
  System.out.println(carflowers[2]);
  // change the data
  String [] Fruits = {"Mango","Watermelon", "Orange", "Apple"};
  Fruits [0]="Jackfruit";
  System.out.println(Fruits[4]);
  //assignment exchange jackfruit with wattermelon
  System.out.println(Fruits[1]);
  																																		
  System.out.println(Arrays.toString(Fruits));
 //Length of Array 
  Object length;
System.out.println(Fruits.length);
		
}
		catch(Exception e) {
System.out.println("array outbound exception");
		}
	}		
		
}