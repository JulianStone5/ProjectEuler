import java.math.BigInteger;
import java.util.ArrayList;

public class prob025 {
	
	public static void main(String[] args) {
		ArrayList<BigInteger> fibonacci = new ArrayList<BigInteger>();
		fibonacci.add(BigInteger.ONE);
		fibonacci.add(BigInteger.ONE);
		while(fibonacci.get(fibonacci.size()-1).toString().length() < 1000) {
			BigInteger a = fibonacci.get(fibonacci.size()-2);
			BigInteger b = fibonacci.get(fibonacci.size()-1);
			fibonacci.add(a.add(b));
		}
		System.out.println(fibonacci.size());
	}
	
}