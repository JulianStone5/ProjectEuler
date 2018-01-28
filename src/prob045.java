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
	
	public static boolean isPentagonal(long p) {
		double n = (1 + Math.sqrt(1 + 24 * p)) / 6;
		return n == (int) n;
	}
	
}