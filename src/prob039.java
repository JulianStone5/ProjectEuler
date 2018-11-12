public class prob039 {
	
	public static void main(String[] args) {
		int pMax = 0;
		int comboMax = 0;
		for(int p = 12; p < 1000; p++) {
			int combos = 0;
			for(int i = 2; i < p/2; i++) {
				for(int j = 2; j < p/2; j++) {
					int k = p - i - j;
					int a = (i < j) ? i : j;
					int b = (i < j) ? j : i;
					int c = (k < b) ? b : k;
					if(a*a+b*b==c*c) combos++;
				}
			}
			if(combos>comboMax) {
				comboMax = combos;
				pMax = p;
			}
		}
		System.out.println(pMax);
	}
	
}