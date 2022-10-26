package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsinArray {
	public static void main(String[] args) {

		/* Code to get the array size and elements from User */
		System.out.println("Enter the array size: ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int arr[] = new int[len];

		System.out.println("Enter Array elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("The entered array is " + Arrays.toString(arr));

		/*
		 * Code to print the result and call the recursive function Here len-1 is used,
		 * because Array index starts from 0
		 */
		int sum = getSum(arr, len - 1);
		System.out.println("Result: " + "The Sum of the elements in the array is " + sum);
	}

	/***************** Recursive Function *********************/

	public static int getSum(int array[], int n) {
		/* If array has only one value, then len-1 = 0, it returns the array[0] */
		if (n == 0) {
			System.out.println("Returning the 0th index element whose value is " + array[0]);
			return array[0];
		}

		/* gets the nth index element and adds it to (n-1)th index element */
		System.out.println("Adding Array element index " + n + " whose value is " + array[n]);
		return array[n] + getSum(array, n - 1);

	}
}
