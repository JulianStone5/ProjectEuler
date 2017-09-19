public class prob003 {	
	public static void main(String[] args) {
		long num = new Long("600851475143");
		for(long i = (long) Math.sqrt(num); i >= 2; i--) {
			if(num % i == 0 && isPrime(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isPrime(long n) {
		for(long i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}