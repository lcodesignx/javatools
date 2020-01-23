// program creates a rectanglo object from GeometricObject class

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /** return width */
    public double getWidth() {
        return this.width;
    }

    /** set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** return height */
    public double getHeight() {
        return this.height;
    }

    /** set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** return area */
    public double getArea() {
        return width * height;
    }

    /** return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
