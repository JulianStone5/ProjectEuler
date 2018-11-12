import java.util.Arrays;

public class prob032 {
	
	public static void main(String[] args) {
		int[] panProd = new int[100];
		int count = 0;
		for(int a = 2; a < 1000; a++) {
			for(int b = 123; b < 10000; b++) {
				String seq = a+""+b+""+a*b;
				if(isPandigital(seq)) {
					boolean inArray = true;
					for(int i = 0; i < count; i++) {
						if(panProd[i] == a*b)  inArray=false;
					}
					if(inArray) {
						panProd[count] = a*b;
						count++;
					}
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += panProd[i];
		}
		System.out.println(sum);
	}
	
	public static boolean isPandigital(String seq) {
		char[] digits = seq.toCharArray();
		Arrays.sort(digits);
		String sequence = new String(digits);
		return sequence.equals("123456789");
	}
	
}