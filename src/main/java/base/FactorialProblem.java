package base;

import java.util.Scanner;

public class FactorialProblem {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int factorial = 1;
		
		for(int i=1;i<=n;i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + n + " is: " + factorial);
		
	}

}
