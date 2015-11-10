package Circle;

/**
 *
 * @author jacob.wiseberg
 */
public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle(double x, double y, double radius) {
        this.radius = radius;
        center = new Point(x,y);
    }

    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //get area
    public double getArea() {
        return Math.PI*radius*radius;
    }
    //get circumference
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
    //get equation
    public String getEquation() {
        return "(x-" + center.getX() + ")^2 + (y-" + center.getY() + ")^2=" + (radius*radius);
    }
    //equals    are two circles identical
    public boolean equals(Circle c) {
        return this.getEquation().equals(c.getEquation());
    }
    //overlaps
    public boolean overlaps(Circle c) {
        //if distance between centers <= sum of both radii
        //then the circles are "overlapping"
        return this.getCenter().distance(c.getCenter()) <= this.radius + c.getRadius();
    }
    @Override
    public String toString() {
        return "This is a circle with a center located at (" + center.getX() + ", " + center.getY() + ") and a radius of " + radius + "\nThis circles equation is " + this.getEquation();
    }
}
