public class prob004 {
	
	public static void main(String[] args) {
		int pal = 0;
		for(int i = 999; i >= 100; i--) {
			for(int j = 999; j >= i; j--) {
				if(isPalindrome(i*j)) {
					if(i * j > pal) pal = i * j;
				}
			}
		}
		System.out.println(pal);
		
		
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