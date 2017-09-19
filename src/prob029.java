import java.math.BigInteger;
import java.util.ArrayList;

public class prob029 {
	
	public static ArrayList<BigInteger> powers = new ArrayList<BigInteger>();
	
	public static void main(String[] args) {
		for(int a = 2; a <= 100; a++) {
			for(int b = 2; b <= 100; b++) {
				BigInteger A = new BigInteger("" + a);
				A = A.pow(b);
				if(!powers.contains(A)) powers.add(A);
			}
		}
		System.out.println(powers.size());
	}
	
}