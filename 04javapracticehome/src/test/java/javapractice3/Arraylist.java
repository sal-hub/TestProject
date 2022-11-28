package javapractice3;

import java.util.ArrayList;


		public class Arraylist {

			public static void main(String[] args) {
				int n=5;
				ArrayList<String>[] al = new ArrayList[n];
				
				for (int i = 0; i < n; i++) {
		            al[i] = new ArrayList<String>();
		        }
		  
		        // We can add any number of columns to each
		        // rows as per our requirements
		        

		  al[0].add("A");
		        al[0].add("B");
		        al[0].add("C");
		        al[1].add("D");
		        al[1].add("E");
		        al[1].add("F");
		        al[1].add("G");
		        al[2].add("H");
		        al[2].add("J");
		        al[2].add("K");
		        al[2].add("L");
		        al[2].add("A");
		        al[3].add("M");
		        al[3].add("N");
		        al[3].add("P");
		        al[3].add("Q");
		        al[3].add("R");
		        al[4].add("B");
		        al[4].add("F");
		        al[4].add("S");
		        al[4].add("T");
		        al[4].add("U");
		        al[4].add("V");
		        al[4].add("Y");
		        al[4].add("Z");
		        
		  
		        
			
		 for (int i = 0; i < n; i++) {
		            for (int j = 0; j < al[i].size(); j++) {
		                System.out.print(al[i].get(j) + " ");
		            }
		            System.out.println();
		        }
		    


			}

		}
