package baseThreeeee;

import java.util.Arrays;

public class RemainWhiteSpacesANdreverseAString {

	public static void main(String[] args) {
		//test();
		//testone();
		testo();

	}

	private static void testo() {
		int arr[]= {1,5,2,4,3};
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
		
	}

	private static void testone() {
	String test="java is a programming language";
		
		String t[]=test.split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for(int i=t.length-1;i>=0;i--) {
			result.append(t[i]).append(" ");
		}
		System.out.print(result);
		
	}

	private static void test() {
		String test="java is a programming language";
		
		String t[]=test.split("\\s+");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < t.length; i++) {
		    result.append(new StringBuilder(t[i]).reverse());
		    if (i != t.length - 1) {
		        result.append(" ");
		    }
		}
		System.out.print(result);
	}

}
