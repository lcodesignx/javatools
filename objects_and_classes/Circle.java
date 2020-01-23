// program creates a circle object from GeometricObject class

public class Circle extends GeometricObject {
    
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** return radius */
    public double getRadius() {
        return this.radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** return area */
    public double getArea() {
        return radius * radius * java.lang.Math.PI;
    }

    /** return the diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** return the perimeter */
    public double getPerimeter() {
        return 2 * radius * java.lang.Math.PI;
    }

    /** print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
