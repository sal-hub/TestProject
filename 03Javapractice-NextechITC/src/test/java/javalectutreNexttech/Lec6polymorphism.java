package javalectutreNexttech;

public class Lec6polymorphism {

	
//polymorphisim = method overloading and method overriding

// method overloading=same method name with different parameter/arguments

 public void fbsignin(String email, String PW) {
	 System.out.println("abcd@hotmail.com");
 }
 public void fbsignin() {
	 System.out.println();
 }
 
 public void fbsignin(int phonenumber, String PW) {
	 System.out.println();
 }
 
  public void fbsignup(String firstname, String lastname, String email) {}
  public void fbsignup(String firstname, String lastname, String email, String city) {}
 
  //method over riding
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	 // Lec6polymorphism myobj = new Lec6polymorphism();
	    
	    //myobj.fbsignin();
	  //  myobj.fbsignin("abcd@hotmail.com","abcde");
  }
}