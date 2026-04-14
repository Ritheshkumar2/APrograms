package cgi;

import java.util.Arrays;
import java.util.Collections;

public class MergeArray {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int[] arr1= {1,2,3,4};
		int[] arr2= {8,6,7,5};
		
		int[] result=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			result[i] =arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			result[arr1.length+i] =arr2[i];
		}	
		System.out.print(Arrays.toString(result));
		Arrays.sort(result);
		System.out.println(" ");
		System.out.print(Arrays.toString(result));
		
	}

}
