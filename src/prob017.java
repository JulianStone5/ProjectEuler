public class prob017 {
	
	public static void main(String[] args) {
		String numbers = "";
		
		for(int i = 1; i <= 1000; i++) {
			String num = "" + i;
			if(i == 1000) {
				numbers += "onethousand";
				break;
			}
			String temp = "";
			if(num.length() == 1 || num.charAt(num.length()-2) != '1') {
				temp += ones(num.charAt(num.length()-1));
				if(num.length() >= 2) {
					temp = tens(num.charAt(num.length()-2)) + temp;
				}
			} else {
				switch(num.charAt(num.length()-1)) {
					case '0':
						temp += "ten";
						break;
					case '1':
						temp += "eleven";
						break;
					case '2':
						temp += "twelve";
						break;
					case '3':
						temp += "thirteen";
						break;
					case '4':
						temp += "fourteen";
						break;
					case '5':
						temp += "fifteen";
						break;
					case '6':
						temp += "sixteen";
						break;
					case '7':
						temp += "seventeen";
						break;
					case '8':
						temp += "eighteen";
						break;
					case '9':
						temp += "nineteen";
						break;
				}
			}
			if(num.length() == 3) {
				String temp1 = ones(num.charAt(0)) + "hundred";
				if(!num.substring(1).equalsIgnoreCase("00")) temp += "and";
				temp = temp1 + temp;
			}
			numbers += temp;
			System.out.println(temp);
		}
		System.out.println(numbers.length());
	}
	
	public static String ones(char ch) {
		switch(ch) {
			case '0':
				return "";
			case '1':
				return "one";
			case '2':
				return "two";
			case '3':
				return "three";
			case '4':
				return "four";
			case '5':
				return "five";
			case '6':
				return "six";
			case '7':
				return "seven";
			case '8':
				return "eight";
			case '9':
				return "nine";
		}
		return "";
	}
	
	public static String tens(char ch) {
		switch(ch) {
			case '0':
				return "";
			case '2':
				return "twenty";
			case '3':
				return "thity";
			case '4':
				return "fourty";
			case '5':
				return "fifty";
			case '6':
				return "sixty";
			case '7':
				return "seventy";
			case '8':
				return "eighty";
			case '9':
				return "ninety";
		}
		return "";
	}
	
}