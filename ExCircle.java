/*
 * The Circle class models a circle with a radius and color.
 */
public class ExCircle {  // Save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// The default constructor with no argument.
	// It sets the radius and color to their default value.
	public ExCircle() {
		radius = 1.0;
		color = "red";
	}

	// 2nd constructor with given radius, but color default
	public ExCircle(double radius) {
		this.radius = radius;
		color = "red";
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

	// Return a description of this instance in the form of
	// Circle[radius=r,color=c]
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}