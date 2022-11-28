package javapractice3;

public class Parent {

	public static void main1(String[] args) {
		
	}
		public void fbsignin(String email, String pw) {
			if(email=="rushmiamir@gmail.com" && pw=="abcd1234") {
				System.out.println("Logged in successfully with valid email and password");
			}
			else {
				System.out.println("Enter valid email or password or both");
			}
		}
		
		public void fbsignin(int phone, String pw) {
			if(phone==1234567890 && pw=="abcd1234" ) {
				System.out.println("Logged in successfully with valid phone number and password");
			}
			else {
				System.out.println("Enter valid phone number or password or both");
			}
		}
		
		void fbsignup() {
			System.out.println("Signed up in default method");
		}
		
		protected void fbsignup(String firstname, String lastname, String address, int phone) {
			System.out.println("Signed up in protected method with the following details:\n" +"First Name: " +firstname +"\nLast Name: " +lastname +"\nAddress: "+address +"\nPhone Number: " +phone);
		}
		
		private void fbeditprofile() {
			System.out.println("I am a private method and only accessible in Parent class");
		}

		public void main(String[] args) {
			
			System.out.println("I am a superclass class. I have different methods with different accessmodifiers.");

			Parent obj = new Parent();
			obj.fbeditprofile();
		}

	}



	


