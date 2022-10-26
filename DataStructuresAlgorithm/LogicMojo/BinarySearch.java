package LogicMojo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary Search implementation explanation program for a sorted array

		// int inputArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		/* Code to get the array size and elements from User */
		System.out.println("Enter the array size: ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int inputArray[] = new int[len];

		System.out.println("Enter Array elements in sorted order:");

		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scan.nextInt();
		}

		/*
		 * Code to print the array with index for understanding purpose - can be ignored
		 */
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println("array[" + i + "]  = " + inputArray[i]);
		}

		/* Code to get the input element from user */
		System.out.println("Enter the element you wanted to search: ");
		int inputKey = scan.nextInt();
		scan.close();

		/* Code to print the result and call the recursive function */
		int result = BinarySearch(inputArray, 0, inputArray.length, inputKey);
		System.out.println("Result: " + "The index of the desired number is " + result);
	}

	/***************** Recursive Function *********************/

	public static int BinarySearch(int array[], int low, int high, int key) {

		/* Default check to find if low index is greater than high */
		if (low > high) {
			return 0;
		}

		// calculate mid by getting the high-low /2.
		/*
		 * Purpose of adding low to the formula is - for mid to higher range, or the
		 * second half, we don't want to start from lower index again in 2nd iteration.
		 * 1st iteration (range - 0 to 10) - 1st half 0-5, 2nd half - 6-10 2nd
		 * iteration- if we don't add low value(6), it'll take from 0
		 */

		int mid = low + ((high - low) / 2);
		System.out.println("Low " + low);
		System.out.println("High " + high);
		System.out.println("Mid " + mid);
		System.out.println("Array Value of mid is " + array[mid] + " Key we are searching is " + key);

		if (key == array[mid]) {
			return mid;

			/* Bin Search for 1st half. So, low is low and High is Mid-1 */
		} else if (key < array[mid]) {
			System.out.println("Running Recursion as " + key + " < " + array[mid]);
			System.out.println("Low = Low, High = Mid-1");
			return BinarySearch(array, low, mid - 1, key);

			/* Bin Search for 2nd half. So, low is Mid + 1 and High is High */
		} else if (key > array[mid]) {
			System.out.println("Running Recursion as " + key + " > " + array[mid]);
			System.out.println("Low = Mid + 1, High = High");
			return BinarySearch(array, mid + 1, high, key);
		}
		return mid;
	}

}