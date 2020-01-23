/**
 * Superclass for Circle and Rectangle
 */

public class GeometricObject {

    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {   
        dateCreated = new java.util.Date();
    }

    /** construct a geometric object with specified parameters */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return this.color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled */
    public boolean isFilled() {
        return this.filled;
    }

    /** set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** return a string representation of this object */
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
