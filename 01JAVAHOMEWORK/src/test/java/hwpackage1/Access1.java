package hwpackage1;

public class Access1 {

	  public int totaltime=100;
	  int hours=40;
	  private int minutes=20;

	
 public static void main(String[]args) {
	System.out.println("Printing attributes from different Accessmodifiers within same class and same package:");
	
	Access1 h=new Access1();
	System.out.println("totaltime"+"="+h.totaltime);
	System.out.println("hours"+"="+h.hours);
	System.out.println("minutes"+"="+h.minutes);
}
}
/*Assignment:
*  Created 2 classes in package 1 and create 1 class in package2
[hwpackage 1->classes-->Access1,Access2 & 2nd package is -->hwpackage2-->class3]
*  In class1 mention attributes with different access modifier 
*  Access all the attributes from the same class and different class*/

