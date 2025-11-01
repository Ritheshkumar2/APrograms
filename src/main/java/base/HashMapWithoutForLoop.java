package base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapWithoutForLoop {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		
		Map<String,Integer> obj=new HashMap<>();
		
		obj.put("name1", 1);
		obj.put("name2", 2);
		obj.put("name3", 3);
		obj.put("name4", 4);
		
		Iterator<Map.Entry<String,Integer>> i=obj.entrySet().iterator();
		
		while(i.hasNext()) {
			 Map.Entry<String, Integer> entry = i.next();
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
	}

}
