package basestrings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		String name1="silent";
		String name2="listen";
		
		char[] ch1=name1.toCharArray();
		char[] ch2=name2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1.length != ch2.length) {
			System.out.print("Not an Anagram");
			return; // ✅ stop execution here if lengths don't match
		}
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.print("Anagram");
		}
		else {
		System.out.print("Not an Anagram");
		}
		
	}

}
