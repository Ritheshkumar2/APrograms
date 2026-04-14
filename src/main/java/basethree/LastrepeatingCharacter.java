package basethree;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LastrepeatingCharacter {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String value="ritheshkumark";
		
		char[] ch=value.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
		}
		
		// Find last repeating character
        for (int i = ch.length - 1; i >= 0; i--) {
            if (map.get(ch[i]) > 1) {
                System.out.println("Last repeating character: " + ch[i]);
                break;
            }
        }
	}

}
