
public class SimCircle {
	private double radius;

	// The default constructor with no argument.
	// It sets the radius and color to their default value.
	public SimCircle() {
		radius = 1.0;
	}

	// 2nd constructor with given radius, but color default
	public SimCircle(double radius) {
		this.radius = radius;
		
	}

	// A public method for retrieving the radius
	public double getRadius() {
		return radius; 
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	// A public method for computing the area of circle
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumfrence(double radius) {
		return 2 * Math.PI * radius;
	}

	// Return a description of this instance in the form of
	// Circle[radius=r,color=c]
	public String toString() {
		return "Circle[Radius=" + radius + " Area=" + getArea() + " Circumfrence=" + getCircumfrence(radius) + "]";
	}
}
