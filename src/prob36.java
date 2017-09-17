public class prob36 {
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 1000000; i++) {
			if(isPalindrome("" + i) && isPalindrome(Integer.toBinaryString(i))) sum += i;
		}
		System.out.println(sum);
	}
	
	public static boolean isPalindrome(String str) {
		String rev = "";
		for(int i = str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		return rev.equals(str);
	}
}