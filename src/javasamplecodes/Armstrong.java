package javasamplecodes;

public class Armstrong {

	public static void main(String[] args) {

		int inputNo = 153;
		int ArmNo = 0;
		
		while (inputNo != 0) {
			int remainder = inputNo % 10;
			ArmNo = (remainder * remainder * remainder) + ArmNo;
			inputNo = inputNo / 10;
		}

		if (ArmNo == 153)
			System.out.println("Armstrong No");
		else
			System.out.println(ArmNo);
	}

}
