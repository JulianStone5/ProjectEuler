public class prob023 {
	
	public static void main(String[] args) {
		boolean[] isAb = new boolean[28124];
		for(int i = 1; i < 28124; i++) {
			isAb[i] = isAbundant(i);
		}
		int sum = 0;
		for(int i = 1; i < 28124; i++) {
			if(!isSum2Ab(isAb, i)) sum += i;
		}
		System.out.println(sum);
	}
	
	public static boolean isSum2Ab(boolean[] isAb, int n) {
		for(int i = 1; i <= n/2; i++) {
			if(isAb[i] && isAb[n-i]) return true;
		}
		return false;
	}
	
	public static boolean isAbundant(int n) {
		int sum = 1;
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) sum += i + n / i;
			if(n % i == 0 && i*i == n) sum -= i;
		}
		return sum > n;
	}
	
}