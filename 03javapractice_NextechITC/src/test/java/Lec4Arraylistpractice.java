import java.util.ArrayList;

public class Lec4Arraylistpractice {

	public static void main(String[] args) {
	
   //Arraylist is resizeable,  not fixed
	
	//syntax ArrayList<datatype> variablename=new ArrayList<datatype>();
		ArrayList<Integer> cars = new ArrayList<Integer>();// Create anArrayList object

	//write Arraylist code to store flowers
		ArrayList<String> flowers = new ArrayList<String>();	
	
	//add the data in Arraylist
		flowers.add("rose");
		flowers.add("blackrose");
		flowers.add("sunflower");
		
	//access sunflower
		flowers.get(1);
	
	//change item we use set method
		flowers.set(0, "Bentley");
		
		//Remove an Item
		flowers.remove(2);
		
		// if want to clear
		flowers.clear();
		
		//Size of Arraylist
		flowers.size();
		
		
	
	}

}
