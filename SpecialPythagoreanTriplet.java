import java.util.ArrayList;

public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		boolean flag = false;

		for (int i = 0; i <= 500; i++) {
			c = 1000 - i;
			ArrayList<int[]> comb = sumPairs(i);
			for (int[] arr : comb) {
				if (arr[0] + arr[1] + c == 1000) System.out.println(".");
				if (arr[0]*arr[0] + arr[1]*arr[1] == c*c) {
					a = arr[0];
					b = arr[1];
					flag = true;
					break;
				}
			}			
			if (flag) break;
		}
		System.out.println(a*a + b*b + " = " + c*c);
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		for (int[] arr : sumPairs(21)) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static ArrayList<int[]> sumPairs(int n) {
		ArrayList<int[]> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n/2+1; j++) {
				if (i + j == n) {
					int[] temp = new int[2];
					temp[0] = i;
					temp[1] = j;
					result.add(temp);
				}
			}
		}
		return result;
	}
}