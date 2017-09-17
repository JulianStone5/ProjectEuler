import java.util.ArrayList;

public class prob7 {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int i = 2;
		while(primes.size() < 10001) {
			if(isPrime(i)) primes.add(i);
			i++;
		}
		System.out.println(primes.get(primes.size()-1));
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}