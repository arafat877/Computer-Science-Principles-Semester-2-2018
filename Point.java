public class Point {
	// Private variables
	private int x;    // x co-ordinate
	private int y;    // y co-ordinate

	// Constructor
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Public methods
	public String toString() {
		return "Point: (" + x + "," + y + ")";
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int newx) {
		x = newx;
	}
	public void setY(int newy) {
		y = newy;
	}
	public void setXY(int newx, int newy) {
		x = newx;
		y = newy;
	}
}