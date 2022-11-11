package javaptac1;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
				String str = "aacccddddbbbad";
				
				for(int i=0; i<str.length(); i++) {
					
					char ch = str.charAt(i);
					Integer val = map.get(ch);//val=''
					if(val!=null) {
						map.put(ch,  new Integer (val+1));
						
					}
					else {
						map.put(ch, 1);
					}
				}
				System.out.println(map);
				
			}
          }


