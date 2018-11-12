public class prob037 {
	
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int i = 23;
		while(count < 11) {
			String num = i +"";
			boolean trunc = true;
			for(int chop = 0; chop < num.length(); chop++) {
				boolean forward = isSectionPrime(num,chop,num.length());
				boolean backward = isSectionPrime(num,0,num.length()-chop);
				if(!(forward&&backward)) {
					trunc = false;
					break;
				}
			}
			if(trunc) {
				sum += i;
				count++;
			}
			i += 2;
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isSectionPrime(String num, int start, int end) {
		String frag = num.substring(start, end);
		return isPrime(Integer.parseInt(frag));
	}
}