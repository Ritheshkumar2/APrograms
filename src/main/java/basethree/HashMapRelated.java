package basethree;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapRelated {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String name="Rithesh";
		char ch[]=name.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++){
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
//		for(Entry<Character, Integer> m:map.entrySet()) {
//			System.out.println(m.getKey()+"-"+m.getValue());
//		}
		
		for(Character m:ch) {
			System.out.println(m+"-"+map.get(m));
		}
		
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		String rem="";
		for(int i=ch.length-1;i>=0;i--) {
			rem=rem+ch[i];
		}
		System.out.print(rem);
	}
	

}
