package javaptac1;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("welcome");
		al.add(11); 
		al.add(2,22); 
		al.add ("c");
		
al.add(2, "Training");
al.add(1, 1234);
System.out.println("number of element:"+al.size());
System.out.println("elements in arraylist:"+al);
   
     HashSet hs=new HashSet();
     hs.add("A");
     hs.add("B");
     hs.add("C");
     hs.add("A");
     hs.add(null);
     hs.add(10);
System.out.println(hs.add("A"));
System.out.println(hs);

	}

}
//https://www.youtube.com/watch?v=wS-ZA2bdM7w
//https://www.youtube.com/watch?v=cPXoLvSuYi0