package basetwo;

import java.util.HashMap;
import java.util.Map;

public class CountOccurancesAndReplaceDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

	private static void test() {
		String vari1="Automation";//output-2u22m22i2n
		String vari=vari1.toLowerCase();
		
		
		Map<Character,Integer> map=new HashMap<>();
		StringBuilder result = new StringBuilder();
	
		// Step 1: count each character
        for (char c : vari.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
     // Step 2: build new string
        for (char c : vari.toCharArray()) {
            if (map.get(c) > 1) {
                result.append(map.get(c)); // replace duplicates with count
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
        
	}

}
