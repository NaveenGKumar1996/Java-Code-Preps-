package javasamplecodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		validateInputIsPrimeOrNot(10);
		printAllPrimeNumbers(30);
		getPrimeNumbers(10);
	}

	private static void validateInputIsPrimeOrNot(int number) {
		int flag = 0;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.println("Not a prime");
				flag = 1;
				break;
			}
		}

		if (flag == 0)
			System.out.println("Prime");
	}

	private static void printAllPrimeNumbers(int number) {
		int flag = 0;
		for (int i = 2; i <= number; i++) {
			for (int j = 2; j <= i / 2;) {
				if ((i % 2 == 0) || (i % 3 == 0)) {
					flag = 1;
					break;
				}
				System.out.println(i);
				break;
			}
			if (flag == 0)
				System.out.println(i);
		}
	}

	private static void getPrimeNumbers(int number) {
		int flag = 0;
		List<Integer> li = new ArrayList<Integer>();

		List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7));

		for (int i = 2; i <= number; i++) {
			for (int j = 2; j <= i / 2;) {
				if (i % 2 == 0 || i % 3 == 0) {
					flag = 1;
					break;
				}
				li.add(i);
				break;
			}

			if (flag == 0)
				li.add(i);
		}
		System.out.println(li);
		System.out.println(li1);

		System.out.println(li.equals(li1));
	}

}