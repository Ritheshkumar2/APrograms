package base;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonReaptingCharacter {

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
		
		// Iterate original string to maintain order
        for (Character c : name.toCharArray()) {
            if (ss.get(c) == 1) {
                System.out.println("First Non Repeating character: " + c);
                break;
            }
        }
	}

}
