package base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountWordFreqency {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String name="RitheshRieshh";
		name = name.toLowerCase();

		
		Map<Character,Integer> ss=new HashMap<>();
		
		for(Character c:name.toCharArray()) {
			ss.put(c, ss.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character,Integer> c:ss.entrySet()) {
			
			System.out.println(c.getKey()+"===="+c.getValue());
		}
		
	}

}
