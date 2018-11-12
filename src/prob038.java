import java.util.Arrays;

public class prob038 {
	
	public static void main(String[] args) {
		int maxPan = 918273645;
		for(int a = 9000; a < 10000; a++) {
			if(isPandigital(a+""+2*a)) {
				if(maxPan<Integer.parseInt(a+""+2*a)) {
					maxPan = Integer.parseInt(a+""+2*a);
				}
			}
		}
		System.out.println(maxPan);
	}
	
	public static boolean isPandigital(String seq) {
		char[] digits = seq.toCharArray();
		Arrays.sort(digits);
		String sequence = new String(digits);
		return sequence.equals("123456789");
	}
	
}