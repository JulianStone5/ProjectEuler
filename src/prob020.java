import java.math.BigInteger;

public class prob020 {
	
	public static void main(String[] args) {
		BigInteger factorial = BigInteger.ONE;
		for(int i = 100; i >= 2; i--) {
			factorial = factorial.multiply(new BigInteger("" + i));
		}
		String num = factorial.toString();
		int sum = 0;
		for(int i = 0; i < num.length(); i++) {
			sum += Integer.parseInt("" + num.charAt(i));
		}
		System.out.println(sum);
	}
	
}