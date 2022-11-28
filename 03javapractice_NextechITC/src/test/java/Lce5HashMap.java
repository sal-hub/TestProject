import java.util.HashMap;

public class Lce5HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap object with Cities and state
	    HashMap<String, String> statecity = new HashMap<String, String>();
        // how to add data in hashmap
	  
	    statecity.put("NY","Albany"); 
	    statecity.put("TX", "Irving");
	    statecity.put("CA","LA");
	    statecity.put("TX", "Dallas");
	    // NY is key and Albany is value
	    System.out.println(statecity);
	  //access iteam
	    statecity.get("NY");
	    System.out.println(statecity.get("NY"));
	  //remove iteam
	  statecity.remove("TX");
	  System.out.println(statecity);
	System.out.println(statecity.get("CA"));
	statecity.size();
	System.out.println(statecity.size());
	
	}

	
	}
	


