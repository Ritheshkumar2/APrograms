package base;

public class FindMaxSubArray {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int arr[]= {1,2,3,45,4,5,6,7,45,12,12,13,1,90};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		System.out.print(max);
		
	}

}
