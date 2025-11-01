package basearrays;

public class FindMaxMinNumbersInArray {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		
		int[] arr= {1,2,3,4,5,6,7,8,8,9,9,1,2,11,0};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}	
		System.out.println("highest value: "+max);
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j] < min) {
				min=arr[j];
			}
		}
		System.out.println("lowest value: "+min);
		
//		for (int i = 1; i < arr.length; i++) {
//	        if (arr[i] > max) {
//	            max = arr[i];
//	        } else if (arr[i] < min) {
//	            min = arr[i];
//	        }}
//	    System.out.println("highest value: " + max);
//	    System.out.println("lowest value: " + min);
		
	}

}
