package LogicMojo;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary Search implementation explanation program for a sorted array

		// int inputArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Enter the array size: ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int inputArray[] = new int[len];

		System.out.println("Enter Array elements in sorted order:");

		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = scan.nextInt();
		}
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println("array[" + i + "]  = " + inputArray[i]);
		}
		System.out.println("Enter the element you wanted to search: ");
		int inputKey = scan.nextInt();
		scan.close();
		int result = BinarySearch(inputArray, 0, inputArray.length, inputKey);
		System.out.println("Result: " + "The index of the desired number is " + result);
	}

	public static int BinarySearch(int array[], int low, int high, int key) {

		if (low > high) {
			return 0;
		}

		int mid = low + ((high - low) / 2);
		System.out.println("Low " + low);
		System.out.println("High " + high);
		System.out.println("Mid " + mid);
		System.out.println("Array Value of mid is " + array[mid] + " Key we are searching is " + key);

		if (key == array[mid]) {
			return mid;

		} else if (key < array[mid]) {
			System.out.println("Running Recursion as " + key + " < " + array[mid]);
			System.out.println("Low = Low, High = Mid-1");
			return BinarySearch(array, low, mid - 1, key);
		} else if (key > array[mid]) {
			System.out.println("Running Recursion as " + key + " > " + array[mid]);
			System.out.println("Low = Mid + 1, High = High");
			return BinarySearch(array, mid + 1, high, key);
		}
		return mid;
	}

}