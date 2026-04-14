package base;

public class CountAsinastring {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String value="alahada";
		
		int count=1;
		
		char[] ch=value.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == 'a') {
				count++;
			}
		}
		System.out.print(count);
	}

}
