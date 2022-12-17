package hwpackage1;

public class Access2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 h=new Access1();
		System.out.println("Printing attributes from different Accessmodifiers within same class and same package:");
		System.out.println("totaltime"+"="+h.totaltime);
		System.out.println("hours"+"="+h.hours);
		
  
	}

}
/* hwpackage1-->class Access1 is protected; that's why it can print; 
 * it has access because it under same package.
 
*/
