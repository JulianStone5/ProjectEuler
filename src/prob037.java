import java.util.ArrayList;

public class prob037 {
	
	public static void main(String[] args) {
		ArrayList<Integer> truncPrimes = new ArrayList<Integer>();
		int i = 10;
		int sum = 0;
		while(truncPrimes.size() < 11) {
			if(isPrime(i)) {
				boolean isTruncPrime = true;
				int digits = i;
				int j = 1;
				while(isTruncPrime && digits % Math.pow(10, j) != digits) {
					isTruncPrime = isPrime((int) (digits % Math.pow(10, j)));
					j++;
				}
				digits /= 10;
				while(isTruncPrime && digits > 0) {
					isTruncPrime = isPrime(digits);
					digits /= 10;
				}
				if(isTruncPrime) {
					truncPrimes.add(i);
					sum += i;
				}
			}
			i++;
		}
		System.out.println(truncPrimes);
		System.out.println(sum);
	}
	
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
}