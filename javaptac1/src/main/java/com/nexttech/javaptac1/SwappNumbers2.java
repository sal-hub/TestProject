package com.nexttech.javaptac1;

import java.util.ArrayList;
import java.util.Collections;

public class SwappNumbers2 {

	public static void main(String[] args) {

// Create the Array List
	        ArrayList<String> ArrList = new ArrayList<String>();
	 
	        // add the values in Array List
	        ArrList.add("Item 1");
	        ArrList.add("Item 2");
	        ArrList.add("Item 3");
	        ArrList.add("Item 4");
	        ArrList.add("Item 5");
	 
	        // display Array List before swap
	        System.out.println("Before Swap the ArrayList ");
	        System.out.println(ArrList);
	 
	        // Swapping the elements at 3 and 4 indices
	        Collections.swap(ArrList, 3, 4);
	 
	        // display Array List after swap
	        System.out.println("After Swap the ArrayList");
	        System.out.println(ArrList);
	    }
	  }
	


