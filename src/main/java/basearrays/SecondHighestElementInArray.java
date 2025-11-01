package basearrays;

public class SecondHighestElementInArray {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int[] arr= {1,2,3,4,5,7,9,8,42,5343,12111};
		
		int max = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] > max) {
		        secondHighest = max; // previous max becomes second highest
		        max = arr[i];        // update max
		    }
		    
		    if (arr[i] > secondHighest && arr[i] != max) {
		        secondHighest = arr[i]; // update second highest if arr[i] < max
		    }
		}

		System.out.println("Second highest: " + secondHighest);

		
	}

}
