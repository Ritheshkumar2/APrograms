package basetwo;

public class FindMaxMinValues {
	
	public static void main(String args[]) {
		test(10);
	}

	private static void test(int n) {
		
		int[] arr = {10, 50, 20, 5, 80, 15};

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int num : arr) {
		    if (num > max) {
		        max = num;
		    }
		    if (num < min) {
		        min = num;
		    }
		}

		System.out.println("Max value: " + max);
		System.out.println("Min value: " + min);

	}

}
