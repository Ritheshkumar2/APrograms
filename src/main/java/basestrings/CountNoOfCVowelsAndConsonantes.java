package basestrings;

public class CountNoOfCVowelsAndConsonantes {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String name="rithesh";
		
		char[] ch=name.toCharArray();
		
		int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') { // check if it's a letter
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
		
	}

}
