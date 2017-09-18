import java.math.BigInteger;

public class prob6 {
	
	public static void main(String[] args) {
		BigInteger squareSum = BigInteger.ZERO;
		BigInteger sumSquared = BigInteger.ZERO;
		for(int i = 1; i <= 100; i++) {
			squareSum = squareSum.add(new BigInteger("" + (i*i)));
			sumSquared = sumSquared.add(new BigInteger("" + i));
		}
		sumSquared = sumSquared.pow(2);
		System.out.println(sumSquared.subtract(squareSum));
	}
	
}