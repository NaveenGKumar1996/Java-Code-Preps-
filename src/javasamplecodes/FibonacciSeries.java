package javasamplecodes;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int total = 10;

		int number1 = 0;
		int number2 = 1;
		int result;

		for (int i = 2; i < total; i++) {
			result = number1 + number2;
			if (result > 10)
				break;
			System.out.println(result);

			number1 = number2;
			number2 = result;
		}
	}

}
