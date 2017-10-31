import java.util.ArrayList;

public class prob035 {
	
	public static void main(String[] args) {
		ArrayList<Integer> cirPrimes = new ArrayList<Integer>();
		
		for(int i = 2; i < 1000000; i++) {
			if(isCirPrime(i)) {
				String n = "" + i;
				int j = 0;
				while(j < n.length()) {
					String cir = n.substring(j) + n.substring(0, j);
					int prime = Integer.parseInt(cir);
					if(!cirPrimes.contains(prime)) cirPrimes.add(prime);
					j++;
				}
			}
		}
		System.out.println(cirPrimes.size());
	}
	
	public static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isCirPrime(int num) {
		String n = "" + num;
		boolean stillCir = true;
		int j = 0;
		while(stillCir && j < n.length()) {
			String cir = n.substring(j) + n.substring(0, j);
			stillCir = isPrime(Integer.parseInt(cir));
			j++;
		}
		return stillCir;
	}
	
}