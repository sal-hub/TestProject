package javalectutreNexttech;

import javatestp.accessmodifiertest2;

public class Lec6Accessmodifier {

	//public access modifier
 public int num1=20; // accessible from any class, any package

  //default
  int num2=23; //only accessible in the same class
 
  //private
private int num3=40; //only accessible in the same class

//how to create a method: Accessmodifier return type methodname (){}

      public void fbsignin() {
    	 //block of code
    	  System.out.println("Logged in");
      }
      public void fbsignin1 () {
    	  System.out.println("Logged in private");
      }
      void fbsignup() {
    	  System.out.println("signed up");
      }
      
  public static void main(String[] args) {
   
	 //attributes or default access modifier
   int num=10; 
   String flower="rose";
  
   //to create an object syntax is Classname objectname=new classname ();		
   
   Lec6Accessmodifier myobj= new Lec6Accessmodifier(); 
   System.out.println(myobj.num1);
   System.out.println(myobj.num2);
   System.out.println(myobj.num3);
  //myobj.num2;
  //myobj.num3;
  
   myobj.fbsignin();
   myobj.fbsignin1();
   myobj.fbsignup();
 
 accessmodifiertest2 myobj2 = new accessmodifiertest2 ();
  System.out.println(myobj2.msg);
      
 }
}
	
		




	
 
