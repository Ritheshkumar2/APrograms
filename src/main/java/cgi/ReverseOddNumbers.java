package cgi;

public class ReverseOddNumbers {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String value="he is doing internships";
		
		String[] values=value.split("\\s+");
		StringBuilder sb=new StringBuilder();
		
		for(String word:values) {
			if(word.length()%2 == 0) {
				sb.append(new StringBuilder(word).reverse());
			}else {
				sb.append(word);
			}
			sb.append(" ");
		}
		System.out.print(sb.toString());//output-he is internships doing
	}

}
