public class prob027 {
	
	public static void main(String[] args) {
		int aMax = 0, bMax = 0, nMax = 0;
		for(int a = -999; a < 1000; a += 2) {
			for(int b = 3; b <= 1000; b += 2) {
				if(isPrime(b)) {
					int n = 0;
					while(isPrime(Math.abs(n^2 + a*n + b))) {
						n++;
					}
					if(n > nMax) {
						nMax = n;
						aMax = a;
						bMax = b;
					}
				}
			}
		}
		System.out.println(bMax);
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
}