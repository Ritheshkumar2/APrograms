package patterns;

public class PrintStars {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
