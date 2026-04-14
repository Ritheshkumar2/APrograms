package baseone;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ocuurencesofcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

	private static void test() {
		String name="RIthesh";
		
		char[] ch=name.toCharArray();
		
		Map<Character,Integer> object=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			object.put(ch[i], object.getOrDefault(ch[i], 0)+1);
		}
		
		for(Entry<Character,Integer> s:object.entrySet()) {
			System.out.println(s.getKey()+"---"+s.getValue());
		}
	}

}
