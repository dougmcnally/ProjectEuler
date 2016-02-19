public class CircularPrimeCounter {

	public static void main(String[] args) {
		long t0 = System.currentTimeMillis();
		final int MAX = (int) 1e6;
		int count = 0;
		for (int i = 2; i < MAX; i++) {
			if (isPrime(i)) {
				boolean flag = true;
				int temp = i;
				int intLog = (int) Math.log10(i);
				do {
					int lastDig = temp % 10;
					temp /= 10;
					temp += lastDig * (int) Math.pow(10, intLog);
					if (!isPrime(temp)) flag = false;
				} while (temp != i);

				if (flag) count++;
			}
		}
		System.out.println("Took " + (System.currentTimeMillis() - t0) + " ms.");
		System.out.println("There are " + count + " circular primes less than " + MAX);
	}

	private static boolean isPrime(int num) {
		if (num % 2 == 0)
			return num == 2;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0) return false;
		return true;
	}
}