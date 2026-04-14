package cgi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayByKElements {

	public static void main(String[] args) {
		//test();
		//missingnumber();
		//merge2arrays();
		//mereg2lists();
		reverseonlyaddnumbers();
		
		
		

	}

	private static void reverseonlyaddnumbers() {
		String value="he is a good boy";
		
		String[] values=value.split("\\s+");
		
		StringBuffer sb=new StringBuffer();
		
		for(String words:values) {
			if(words.length()%2 != 0) {
				sb.append(new StringBuffer(words).reverse());
			}else {
				sb.append(words);
			}
			sb.append(" ");
		}
		System.out.print(sb.toString());
		
	}

	private static void mereg2lists() {
		List<Integer> list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		List<Integer> list2=new ArrayList();
		list2.add(1);
		list2.add(2);
		
		list1.addAll(list2);
		
		System.out.print(list1);
		
	}

	private static void merge2arrays() {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		
		int[] result=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			result[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			result[arr1.length+i]=arr2[i];
		}
		System.out.print(Arrays.toString(result));
	}

	private static void missingnumber() {
		int[] arr= {1,2,3,4,5,6,7,9};
		
		int n=arr.length+1;		
		int actualValue=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		int missing = actualValue - sum;

	    System.out.println(missing);
		
	}

	private static void test() {
		int[] input= {1,2,3,4,5,6};
		int k=2;
		int n=input.length;
		
		for(int i=0;i<k;i++) {
			int first=input[0];
			for(int j=0;j<n-1;j++) {
				input[j]=input[j+1];
			}
			input[n-1]=first;
		}
		System.out.print(Arrays.toString(input));
		
	}

}
