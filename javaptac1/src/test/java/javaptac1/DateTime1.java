package javaptac1;

import java.sql.Date;
import java.time.Clock;

public class DateTime1 {

	public static void main(String[] args) {
		
		      Clock obj = Clock.systemUTC();
		      System.out.println("Current date time: "+obj.instant());
		      
		      Date date = new Date(0, 0, 0);
		      System.out.print(date);
	}

}
