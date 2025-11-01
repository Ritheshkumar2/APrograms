package base;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArrayUsingHashMap {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		int arr[]= {1,2,3,1,2,4,5,67,7,6};
		
		Map<Integer,Integer> s=new HashMap<>();
		
		for(int a:arr) {
			s.put(a, s.getOrDefault(a, 0)+1);
		}
		
		for (Map.Entry<Integer, Integer> entry : s.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate: " + entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
		
	}

}
