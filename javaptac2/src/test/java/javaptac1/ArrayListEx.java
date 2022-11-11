package javaptac1;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
	ArrayList <String> list=new ArrayList<String>();
	 list.add("Raj");
	 list.add("Rani");
	 list.add("Pom");
	 list.add("Ravi");
	 list.add("Ronie");
	 System.out.println(list.size());
	 for(String s:list)
	 {
		 System.out.println(s);
	}

}}
