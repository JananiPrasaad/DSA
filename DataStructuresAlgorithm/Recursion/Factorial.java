package Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Code to get the input number from User */
		System.out.println("Enter the element: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		/* Code to print the result and call the recursive function */
		int fact = getFactorial(num);
		System.out.println("Result: " + "The Factorial of the number " + num + " is " + fact);
		scan.close();

	}

	/***************** Recursive Function *********************/

	public static int getFactorial(int n) {
		/* Fact of 0 is 0 and Fact of 1 is 1 */
		if (n == 0 | n == 1) {
			System.out.println("n value is " + n);
			return n;
		}

		/* Factorial of 3 = 3*2*1 i.e., n*(n-1) */
		System.out.println("n value is " + n);
		return n * getFactorial(n - 1);
	}

}
