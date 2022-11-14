package LogicMojo;

import java.util.Arrays;

public class HighestNuminArray {

	/*
	 * This program is for finding the highest number in an array, where numbers are
	 * increasing and then decreases
	 */

	/*
	 * There are 3 possible case for an integer in the array 1. Left is less and
	 * right is more. (no.s on left side on the highest number) 2. Right is less and
	 * Left is more. (no.s on right side on the highest number) 3. Left is less and
	 * right is less. (the highest number)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArray = new int[] { 1, 3, 5, 7, 9, 6, 4, 2, 0 };

		System.out.println(Arrays.toString(inputArray));
		System.out.println(
				"Result: " + "Highest Number in the array is " + findMaxValue(inputArray, 0, inputArray.length - 1));

	}

	public static int findMaxValue(int[] arr, int low, int high) {
		
		//If there is only one element

		if (low == high) {
			return arr[low];
		}
		
		//If there is two elements, comparison between two

		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				return arr[low];
			} else
				return arr[high];
		}
		
		//calculate mid value

		int mid = (high + low) / 2;
		
		
		//Left is less and right is less. (the highest number)

		if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
			return arr[mid];
		}
		
		//Right is less and left is more, that means, it should search in 1st half

		if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
			return findMaxValue(arr, low, mid - 1);
			
			// or search should be in right half
		} else
			return findMaxValue(arr, mid + 1, high);

	}
}
