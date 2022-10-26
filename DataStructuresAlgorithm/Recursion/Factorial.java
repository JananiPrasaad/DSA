package Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the element: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact = getFactorial(num);
		System.out.println("Result: " + "The Factorial of the number " + num + " is " + fact);
		scan.close();

	}

	public static int getFactorial(int n) {
		if (n == 0 | n == 1) {
			System.out.println("n value is " + n);
			return n;
		}
		System.out.println("n value is " + n);
		return n * getFactorial(n - 1);
	}

}
