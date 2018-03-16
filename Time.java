
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
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
	
	public void setHour(int newHour) {
		hour = newHour;
	}
	
	public void setMinute(int newMinute) {
		minute = newMinute;
	}
	
	public void setSecond(int newSecond) {
		second = newSecond;
	}
	
	public void setTime(int newHour, int newMinute, int newSecond) {
		hour = newHour;
		minute = newMinute;
		second = newSecond;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	public Time nextSecond() {
		setSecond(second + 1);
		return this;
	}
	
	public Time previousSecond() {
		setSecond(second - 1);
		return this;
	}

}
