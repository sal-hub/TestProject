package hwpackage1;

public class Parentcls {
	// modifier_type return_type method_name

  public void fbsignin(String email,int pw) {
System.out.println("Public method for fb sign in");				
					
}
  void fbsignin (int ph, int pw) {
	  System.out.println("Default method for fb signin2");			  
  }
private void fbsignin() {
	System.out.println("Public method for fb signin3");			
}
  
  
  
  public static void main(String[] args) {
	
	  Parentcls ch2=new Parentcls();
	  ch2.fbsignin();
	  
	}

}
