public class prob12 {	
	
	public static void main(String[] args) {
		int numDiv = 0;
		int term = 0;
		while(numDiv <= 500) {
			term++;
			numDiv = numDivisors(triNum(term));
		}
		System.out.println(triNum(term));
	}
	
	public static int triNum(int term) {
		return term * (term + 1) / 2;
	}
	
	public static int numDivisors(int n) {
		int total = 0;
		for(int i = 1; i*i <= n; i++) {
			if(n % i == 0) {
				total += 2;
				if(n / i == i) total--;
			}
		}
		return total;
	}
	
}