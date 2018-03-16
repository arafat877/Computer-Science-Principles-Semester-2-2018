
public class TestTime {

	public static void main(String[] args) {
		Time time = new Time(10, 41, 10);
		
		System.out.println(time);
		
		time.setTime(20, 12, 43);
		
		System.out.println(time);
		
		time.nextSecond();
		
		System.out.println(time);

	}

}
