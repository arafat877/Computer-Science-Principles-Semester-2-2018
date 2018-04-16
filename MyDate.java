
public class MyDate {
	private int year = 0;
	private int month = 0;
	private int day = 0;
	
	private static String[] strMonths = new String[] {"Jan", "Feb", "Mar", "Apr", "Aug", "Sept", "Oct", "Nov", "Dec"};
	private static String[] strDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private static int[] daysInMonths = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};
	
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean  isValidDate(int year, int month, int day) {
		if(year <= 9999) {
			if(month <= 12) {
				if(day <= daysInMonths[month - 1]) {
					return true;
				}
				if(isLeapYear(year)) {
					if(month == 2 - 1) {
						if(day <= daysInMonths[month - 1] + 1) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}
	
	public static int getDayOfWeek(int year, int month, int day) {
		if(isValidDate(year, month, day)) {
			return day % 7;
		}
		else {
			return -1;
		}
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(int year, int month, int day) {
		if(isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setYear(int newYear) {
		if (newYear >= 0 && newYear <= 9999) {
			year = newYear;
		}
	}
	
	public void setMonth(int newMonth) {
		if (newMonth >= 0 && newMonth <= 12) {
			month = newMonth;
		}
		if(newMonth > 12) {
			month = 0;
			nextYear();
		}
		else if (newMonth < 0) {
			month = 0;
			previousYear();
		}
	}
	
	public void setDay(int newDay) {
		if(newDay > 0 && newDay <= daysInMonths[month - 1]) {
			day = newDay;
		}
		else if(isLeapYear(year)) {
			if(month == 2 - 1) {
				if(newDay > 0 && newDay <= daysInMonths[month - 1] + 1) {
					day = newDay;
				}
			}
		}
		if(day > daysInMonths[month - 1]) {
			day = 0;
			nextMonth();
		}
		if(newDay < 0) {
			day = 0;
			previousDay();
		}
	}
	
	public String toString() {
		return strDays[getDay()] + Integer.toString(day) + strMonths[getMonth()] + Integer.toString(year);
	}
	
	public MyDate nextDay() {
		setDay(day + 1);
		return this;
	}
	
	public MyDate nextMonth() {
		setMonth(month + 1);
		return this;
	}
	
	public MyDate nextYear() {
		setYear(year + 1);
		return this;
	}
	
	public MyDate previousDay() {
		setDay(day - 1);
		return this;
	}
	
	public MyDate previousMonth() {
		setMonth(month - 1);
		return this;
	}
	
	public MyDate previousYear() {
		setYear(year - 1);
		return this;
	}
	
	//Update previous stuff and set stuff

}
