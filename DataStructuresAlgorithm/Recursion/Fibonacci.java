package Recursion;

import java.util.Scanner;

public class Fibonacci {
	public static int n1 = 0, n2 = 1, n3;

	public static void main(String[] args) {
		System.out.println("Enter the element: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fib = getFibonacci(num);
		System.out.println("Result: " + "The Fibonacci value of the number " + num + " is " + fib);

		System.out.println(0);
		System.out.println(1);
		printFibSeries(num - 2);
		scan.close();

	}

	private static int getFibonacci(int n) {
		if (n == 0 || n == 1) {
		//	System.out.println("I'm in default loop and n value is " + n);
			return n;
		}

		//System.out.println("n value is " + n);
		//System.out.println(getFibonacci(n - 1) + getFibonacci(n - 2));
		return getFibonacci(n - 1) + getFibonacci(n - 2);

	}

	private static int printFibSeries(int n) {

		if (n == 0) {
			return n;
		}

		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;

		System.out.println(n3);
		return printFibSeries(n - 1);

	}

}
