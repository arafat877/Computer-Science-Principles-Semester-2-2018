
public class TestDate {

	public static void main(String[] args) {
		Date date = new Date(12, 21, 2014);
		
		System.out.println(date);
		
		date.setDate(10, 12, 2017);
		
		System.out.println("New date: " + date);

	}

}
