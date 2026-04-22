package cgi;

import java.util.Scanner;

public class FindElementIndex {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int arr[]= {1,3,3,4,5,6,6,7,8,9,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("value:");
		int value=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == value) {
				System.out.print(i+" ");
				found=true;
			}
		}
		if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
		
	}

}
