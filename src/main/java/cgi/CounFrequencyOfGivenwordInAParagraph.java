package cgi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CounFrequencyOfGivenwordInAParagraph {

	public static void main(String[] args) {
		//test();
		//testone();//input-K1n2ki2//output-Knki
		//removeduplicates();
		addduplicates();

	}

	private static void addduplicates() {
		String value = "rithesh";

	    Set<Character> seen = new HashSet<>();
	    Set<Character> duplicates = new LinkedHashSet<>();

	    for(char c : value.toCharArray()) {
	        if(!seen.add(c)) {
	            duplicates.add(c);
	        }
	    }

	    System.out.println(duplicates.toString());
	}

	private static void removeduplicates() {
		String value="rithesh";
		
		char[] ch=value.toCharArray();
		
		Set<Character> set=new HashSet<>();
		
		for(int i=0;i<ch.length;i++) {
			if(!set.contains(ch[i])) {
				set.add(ch[i]);
			}
		}
		//System.out.print(set.toString());
		for(char c:set) {
			System.out.print(c+" ");
		}
		
	}

	private static void testone() {
		String value="K1n2ki2";
		char[] ch=value.toCharArray();
		StringBuffer buf=new StringBuffer();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isAlphabetic(ch[i])) {
				buf.append(ch[i]);
			}
		}
		System.out.print(buf.toString());
		
	}

	private static void test() {
		String value="he is an automation test engineer";
		
		String[] values=value.split("\\s+");
		
		Map<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<values.length;i++) {
			map.put(values[i], map.getOrDefault(values[i], 0)+1);
		}
		
		for(Entry<String, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		
	}

}
