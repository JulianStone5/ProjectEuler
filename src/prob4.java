public class prob4 {
	
	public static void main(String[] args) {
		int pal = 0;
		System.out.println(pal);
		for(int i = 999; i >= 100; i++) {
			for(int j = 999; j >= 100; j++) {
				if(isPalindrome(i*j)) {
					if(i * j > pal) pal = i * j;
				}
			}
		}
		
		
	}
	
	public static boolean isPalindrome(int n) {
		String norm = "" + n;
		String rev = "";
		for(int i = norm.length()-1; i >= 0; i--) {
			rev += norm.charAt(i);
		}
		return norm.equals(rev);
	}
	
}