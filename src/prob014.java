public class prob014 {
	
	public static void main(String[] args) {
		int maxSteps = 0;
		long num = 0;
		for(long i = 999999; i > 19; i--) {
			long n = i;
			int steps = 0;
			while(n != 1) {
				if(n % 2 == 0) {
					n = nIsEven(n);
				}
				else n = nIsOdd(n);
				steps++;
			}
			if(steps > maxSteps) {
				num = i;
				maxSteps = steps;
			}
		}
		System.out.println(num);
	}
	
	public static long nIsEven(long n) {
		return n / 2;
	}
	
	public static long nIsOdd(long n) {
		return 3 * n + 1;
	}
	
}