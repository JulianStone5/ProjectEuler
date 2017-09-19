public class prob045 {
	
	public static void main(String[] args) {
		int i = 144;
		while(true) {
			long result = i * (2*i-1);
			if(isPentagonal(result)) {
				System.out.println(result); 
				break;
			}
			i++;
		}
	}
	
	public static boolean isPentagonal(long n) {
		long discriminant = 1 + 24 * n;
		long temp = (long) Math.sqrt(discriminant);
		if(temp * temp != discriminant) return false;
		return true;
	}
	
}