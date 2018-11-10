public class prob027 {
	
	public static void main(String[] args) {
		int aMax = 0, bMax = 0, nMax = 0;
		for(int a = -999; a < 1000; a++) {
			for(int b = 0; b <= 1000; b++) {
				if(isPrime(b)) {
					int n = 0;
					while(isPrime(n*n + a*n + b)) {
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
		System.out.println(aMax*bMax);
	}
	
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}