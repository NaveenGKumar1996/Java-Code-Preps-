package NumberReversing;

public class Reverse {
	public static void main(String[] args) {
		System.out.println(getReversedNumberFor(12345));
	}

	public static int getReversedNumberFor(int givenNumber) {
		int tempNumber = 0, reversedNumber = 0;
		while (givenNumber != 0) {
			tempNumber = givenNumber % 10;
			reversedNumber = reversedNumber * 10 + tempNumber;
			givenNumber = givenNumber / 10;
		}
		return reversedNumber;
	}
}