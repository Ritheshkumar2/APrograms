package cgi;

import java.util.Arrays;

public class MoveZerosToLast {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int[] arr= {1,0,2,0,3,0,4,0};
		
		int n=arr.length;
		
		int index=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] != 0) {
				arr[index]=arr[i];
				index++;
			}
		}
		
		// Step 2: Fill remaining positions with 0
        for(int i = index; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
	}
	
}
