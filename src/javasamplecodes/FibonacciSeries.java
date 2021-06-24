package javasamplecodes;

public class FibonacciSeries {

	public static void main(String[] args) {
		int total = 10;

		int number1 = 0;
		int number2 = 1;
		int number3;

		for (int i = 2; i < total; i++) {
			number3 = number1 + number2;
			if (number3 > 10)
				break;
			System.out.println(number3);

			number1 = number2;
			number2 = number3;

		}
	}

}
