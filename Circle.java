/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle {    // Save as "Circle.java"
   // Private instance variables
   private double radius = 1.0;
   private String color = "red";
   
   // Constructors (overloaded)
   public Circle() {                   // 1st Constructor
   }
   public Circle(double r) {           // 2nd Constructor
      radius = r;
   }
   public Circle(double r, String c) { // 3rd Constructor
      radius = r;
      color = c;
   }
   
   // Public methods
   public double getRadius() {
      return radius;
   }
   public void setRadius(double newr) {
	   radius = newr;
   }
   public String getColor() {
      return color;
   }
   public void setColor(String newc) {
	   color = newc;
   }
   public double getArea() {
      return radius * radius * Math.PI;
   }
   public String toString() {
	   return "Circle[radius=" + getRadius() + ",color=" + getColor() + "]";
   }
}