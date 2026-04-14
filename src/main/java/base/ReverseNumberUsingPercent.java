package base;

public class ReverseNumberUsingPercent {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int value=12345;
		
		int rev=0;
		
		while(value>0) {
			int digit=value%10;
			rev=rev*10+digit;
			value=value/10;
		}
		System.out.print(rev);		
	}

}
