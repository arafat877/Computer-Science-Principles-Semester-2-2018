
public class Square extends Rectangle {
	private double side;
	private String color;
	private boolean filled;
	
	public Square() {
		
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled) {
		this.side = side;
		this.color = color;
		this.filled = filled;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double newSide) {
		side = newSide;
	}

	@Override
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	@Override
	public void setLength(double newLength) {
		length = newLength;
	}
	@Override
	public String toString() {
		return "A Square with side=" + side + ",which is a subclass of" + super.toString();
				
	}

}
