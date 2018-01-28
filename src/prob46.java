import java.util.ArrayList;

public class prob46 {
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		primes.add(13);
		primes.add(17);
		primes.add(19);
		primes.add(23);
		primes.add(29);
		primes.add(31);
		int n = 35;
		boolean found = false;
		while(!found) {
			if(isPrime(n)) {
				primes.add(n);
			} else if(!conjWorks(n)) {
				System.out.println(n);
				found = true;
			}
			n += 2;
		}
	}
	
	public static boolean isPrime(int n) {
		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static boolean conjWorks(int n) {
		for(int i = 0; i < primes.size(); i++) {
			int temp = (n - primes.get(i)) / 2;
			if(((int) Math.sqrt(temp)) == Math.sqrt(temp)) return true;
		}
		return false;
	}
}