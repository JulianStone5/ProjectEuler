public class prob019 {
	
	public static void main(String[] args) {
		int sunOnFirst = 0;
		int daysInMonth;
		int dayOfWeek = 3;
		int dayOfMonth = 1;
		int year = 1901;
		int month = 1;
		while(year <= 2000) {
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) daysInMonth = 31;
			else if(month != 2) daysInMonth = 30;
			else if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) daysInMonth = 28;
			else daysInMonth = 29;
			
			if(dayOfWeek == 1 && dayOfMonth == 1) sunOnFirst++;
			dayOfWeek++;
			dayOfMonth++;
			if(dayOfWeek == 8) dayOfWeek = 1;
			if(dayOfMonth > daysInMonth) {
				month++;
				dayOfMonth = 1;
			}
			if(month > 12) {
				year++;
				month = 1;
			}
		}
		System.out.println(sunOnFirst);
	}
	
}