package basearrays;

public class ReverseAnArrayWithoutExtraArray {

	public static void main(String[] args) {
		test();
		test1WithExtraArray();
		test2();
		//length starts from 1 
		//index starts from 0

	}

	private static void test2() {
        int[] arr= {1,2,3,4,5};
		
		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.print(arr[i] + " ");
		}
		System.out.println();            
		
	}

	private static void test1WithExtraArray() {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] reversed = new int[arr.length]; // extra array with same size
		//System.out.print(arr.length);
		// Fill reversed array from end of arr
		for (int i = 0; i < arr.length; i++) {
		    reversed[i] = arr[arr.length - 1 - i];
		}

		// Print reversed array
		System.out.print("Reversed array: ");
		for (int num : reversed) {
		    System.out.print(num + " ");
		}

		
		
	}

	private static void test() {
		int[] arr = {1, 2, 3, 4, 5};

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
		    int temp = arr[left];
		    arr[left] = arr[right];
		    arr[right] = temp;

		    left++;
		    right--;
		}

		System.out.print("Reversed array: ");
		for (int num : arr) {
		    System.out.print(num + " ");
		}
		System.out.println();
	}
	

}
