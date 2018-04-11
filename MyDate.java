
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	private String[] strMonths = new String[] {"Jan", "Feb", "Mar", "Apr", "Aug", "Sept", "Oct", "Nov", "Dec"};
	private String[] strDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private int[] daysInMonths = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};
	
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean  isValidDate(int year, int month, int day) {
		
	}

}
