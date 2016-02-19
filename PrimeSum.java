
public class PrimeSum {

	public static void main(String[] args) {
		final int MAX = (int) 2e6;
		long sum = 0l;
		long t0 = System.currentTimeMillis();
		for (int i = 2; i < MAX; i++)
			if (isPrime(i)) sum += i;
		System.out.println("Took " + (System.currentTimeMillis() - t0) + " ms.");
		System.out.println(sum);
		
	}
	
	private static boolean isPrime(int num) {
		if (num % 2 == 0)
			return num == 2;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0) return false;
		return true;
	}

}
