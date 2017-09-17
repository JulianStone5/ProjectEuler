import java.util.ArrayList;

public class prob10 {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		primes.add(2);
		int i = 3;
		while(primes.get(primes.size()-1) < 2000000) {
			if(isPrime(i)) primes.add(i);
			i++;
		}
		long sum = 0;
		for(int j = 0; j < primes.size()-1; j++) {
			sum += primes.get(j);
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}