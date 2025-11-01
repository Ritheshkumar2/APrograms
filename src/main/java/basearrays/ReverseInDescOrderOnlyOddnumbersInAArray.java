package basearrays;

import java.util.Arrays;

public class ReverseInDescOrderOnlyOddnumbersInAArray {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		int[] arr= {1,2,3,4,5,6,7};
		
		// Step 1: Count odd numbers and store them in a temporary array
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }

        int[] odds = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                odds[index++] = num;
            }
        }
        
        Arrays.sort(odds);
        
     // Step 2: Sort odd numbers in descending order
        Arrays.sort(odds); // ascending first
        for (int i = 0; i < odds.length / 2; i++) { // reverse in-place
            int temp = odds[i];
            odds[i] = odds[odds.length - 1 - i];
            odds[odds.length - 1 - i] = temp;
        }

        // Step 3: Put the sorted odd numbers back into original array
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = odds[index++];
            }
        }

        // Print final array
        System.out.println(Arrays.toString(arr));
	}

}
