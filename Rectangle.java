
public class Rectangle {
	public double length;
	public double width;
	
	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double newLength) {
		length = newLength;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	} 
	
	public String toString() {
		return "Rectangle[Area=" + getArea() + " Perimeter=" + getPerimeter() + "]";
	}
}
