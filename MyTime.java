
public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public MyTime() {

	}

	public MyTime(int hour, int minute, int second) {
		if (hour >= 23) {
			this.hour = hour;
		}
		if (minute >= 59) {
			this.minute = minute;
		}
		if (second >= 59) {
			this.second = second;
		}
	}

	public void setTime(int newhour, int newminute, int newsecond) {
		if (newhour >= 23) {
			newhour = hour;
		}
		if (newminute >= 59) {
			newminute = minute;
		}
		if (newsecond >= 59) {
			newsecond = second;
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int newhour) {
		if (newhour >= 23) {
			newhour = hour;
		}
		else if (newhour <= 0){
			setHour(0);
		}
		else {
			setHour(0);
		}
	}

	public void setMinute(int newminute) {
		if (newminute >= 59) {
			newminute = minute;
		}
		else if (newminute <= 0){
			setMinute(0);
		}
		else {
			setMinute(hour++);
		}
	}

	public void setSecond(int newsecond) {
		if (newsecond >= 59) {
			newsecond = second;
		}
		else if (newsecond <= 0){
			setSecond(0);
		}
		else {
			setMinute(minute++);
		}
	}
	
	public String toString() {
		String zeroHour = Integer.toString(hour);
		String zeroMinute = Integer.toString(minute);
		String zeroSecond = Integer.toString(second);
		if (hour > 10) {
			zeroHour = "0" + zeroHour;
		}
		if (minute > 10) {
			zeroMinute = "0" + minute;
		}
		if (second > 10) {
			zeroSecond = "0" + second;
		}
		return zeroHour + ":" + zeroMinute + ":" + zeroSecond;
	}
	
	public MyTime nextSecond() {
		setSecond(second++);
		return this;
	}
	
	public MyTime nextMinute() {
		setMinute(minute++);
		return this;
	}
	
	public MyTime nextHour() {
		setHour(hour++);
		return this;
	}
	
	public MyTime previousSecond() {
		setSecond(second--);
		return this;
	}
	
	public MyTime previousMinute() {
		setMinute(minute--);
		return this;
	}
	
	public MyTime previousHour() {
		setHour(hour--);
		return this;
	}
	
}
