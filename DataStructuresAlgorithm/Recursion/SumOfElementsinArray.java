package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsinArray {
	public static void main(String[] args) {
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
		int sum = getSum(arr, len - 1);
		System.out.println("Result: " + "The Sum of the elements in the array is " + sum);
	}

	public static int getSum(int array[], int n) {
		if (n == 0) {
			System.out.println("Returning the 0th index element whose value is " + array[0]);
			return array[0];
		}

		System.out.println("Adding Array element index " + n + " whose value is " + array[n]);
		return array[n] + getSum(array, n - 1);

	}
}
