package javalectutreNexttech;

public class Lec6Accessmodifier {
  
  //public access modifier
   public int num1=20; // accessible from any class, any package

   //default
    int num2=23; //only accessible in the same class
 
   //private
    private int num3=40; //only accessible in the same class

//how to create a method: Accessmodifier returntype methodname(){}
    public void fbsignin() {
   	 //block of code
   	  System.out.println("Logged in using fbsigninPublic()");
     }
     private void fbsignin1 () {
   	  System.out.println("Logged in using fbsigninprivate()");
     }
     void fbsignup() {
   	  System.out.println("Logged in using fbsigned upDefault()");
     }
     

  public static void main(String[] args) {
   
	 //attributes or default access modifier
      int num=10; 
      String flower="rose";
  
   //to create an object syntax is Classname objectname=new classname ();		
   
   Lec6Accessmodifier myobj= new Lec6Accessmodifier(); 
   //myobj.num1
   //myobj.num2;
   //myobj.num3;
  
   System.out.println(myobj.num1);
   System.out.println(myobj.num2);
   System.out.println(myobj.num3);
  
  
   myobj.fbsignin();
   myobj.fbsignin1();
   myobj.fbsignup();
 
 
      
 }
}
	
		




	
 
