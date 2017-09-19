import java.math.BigInteger;

public class prob016 {
	
	public static void main(String[] args) {
		BigInteger num = new BigInteger("2");
		num = num.pow(1000);
		String numStr = num.toString();
		int sum = 0;
		for(int i = 0; i < numStr.length(); i++) {
			sum += Integer.parseInt("" + numStr.charAt(i));
		}
		System.out.println(sum);
	}
	
}