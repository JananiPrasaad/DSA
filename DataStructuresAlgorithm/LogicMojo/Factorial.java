package LogicMojo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		System.out.println("Factorial of the number is  " + getFactorial(num));
		scan.close();
	}

	public static int getFactorial(int num) {
		if (num == 0 || num == 1) {
			return num;
		}

		return num * getFactorial(num - 1);
	}

}
