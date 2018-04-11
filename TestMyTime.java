
public class TestMyTime {

	public static void main(String[] args) {
		MyTime time = new MyTime(12, 34, 19);
		
		System.out.println("Time: " + time);
		
		time.setTime(10, 42, 26);
		
		System.out.println("New Time: " + time);
		
		time.nextSecond();
		
		System.out.println("Next Second: " + time.getSecond());
		
		time.previousMinute();
		
		System.out.println("Previous Minute: " + time.getMinute());

	}

}
