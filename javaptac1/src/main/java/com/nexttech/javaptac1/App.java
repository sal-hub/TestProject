package com.nexttech.javaptac1;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
   //Print Single Letter
        String a="Java";
    
		char c=a.charAt(0);
        System.out.println( c);
  //Combine String value
        String x= "Mohammad";
        String y= "ahmmad";
        String z= "Moni";
        String p= x+" "+y+""+z;
  //Find duplicate value
     String name []= {"Java","Groovy","Javascript","C++","Java"};
     Set<String>st=new HashSet<String>();
     for(String name1:name) {
    	 if(st.add(name1)==false);{
    	System.out.println("Duplicate Value is::"+name1);
    		 
    	 }
    	 
     }
    }
}

