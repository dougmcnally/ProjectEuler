public class Pythag2 {

	public static void main(String[] args) {
		boolean found = false;
		for (int c = 333; c < 1000; c++) {
			for (int b = 0; b < c; b++) {
				int a = 1000 - (b + c);
				if (a*a + b*b == c*c) {
					System.out.println("a = " + a + ", b = " + b + ", c = " + c);
					System.out.println("abc = " + a*b*c);
					found = true;
					break;
				}
			}
			if (found) break;			
		}
	}
}