public class EvenFibonacci {
	public static void main(String[] args) {
		final int MAX = (int)4e6;
		int sum = 0;
		int count = 1;
		int current;
		long t0 = System.currentTimeMillis();
		do {
			current = fib(count);
			count++;
			if (current % 2 == 0) sum += current;
		} while(current < MAX);
		System.out.println(System.currentTimeMillis()-t0 +" ms");
		System.out.println(sum);		
	}
	
	public static int fib(int n) throws ArithmeticException {
		if (n <= 0) throw new ArithmeticException();
		if (n == 1 || n == 2) return n;
		return fib(n-1) + fib(n-2);
	}
}