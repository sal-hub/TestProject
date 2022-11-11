
package javaptac1;

import java.util.Arrays;
import java.util.Collections;

public class MinNMax {
    public static void main(String[] args) {
    	
    	 Integer[] num = { 2, 4, 7, 5, 9 };
    	
        int min = Collections.min(Arrays.asList(num));
  
         int max = Collections.max(Arrays.asList(num));
  
         // printing minimum and maximum numbers
         System.out.println("Minimum number: "+ min);
                            
         System.out.println("Maximum number: "+ max);
                            
    }  

}

