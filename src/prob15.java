import java.math.BigInteger;

public class prob15 {
	
	public static void main(String[] args) {
		BigInteger numer = BigInteger.ONE;
		BigInteger denom = BigInteger.ONE;
		for(int i = 1; i <= 20; i++) {
			numer = numer.multiply(new BigInteger("" + (i+20)));
			denom = denom.multiply(new BigInteger("" + i));
		}
		System.out.println(numer.divide(denom).toString());
	}
	
}