package javasamplecodes;

public class starpattern {

	public static void main(String[] args) {
		leftTriangleStar(5);
		leftTriangleStarBottomToTop(5);
		
	}

	public static void leftTriangleStarBottomToTop(int noOfRowCol) {

		for (int i = 0; i <= noOfRowCol-1; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void leftTriangleStar(int noOfRowCol) {

		for (int i = 0; i <= noOfRowCol - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
