package basearrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesValuesFromArray {

	public static void main(String[] args) {
		test();
		test2();
	}

	

	private static void test2() {
		int[] arr= {1,2,1,2,3,4,5,3,7,8,9};
		
		Arrays.sort(arr);
		System.out.print("Unique values: ");
	    System.out.print(arr[0] + " "); // Print first element (always unique in sorted array)
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] != arr[i - 1]) { // Print only when current != previous
	            System.out.print(arr[i] + " ");
	        }
	    }
	    System.out.println();

	}

	private static void test() {
		int[] arr= {1,2,1,2,3,4,5,3,7,8,9};
		
		Set<Integer> cc=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!cc.contains(arr[i])) {
				cc.add(arr[i]);
			}
		}
		System.out.println(cc);
		
	}

}
