package Circle;

/**
 *
 * @author jacob.wiseberg
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    
    // sqrt( (x2-x1)^2 - (y2-y1)^2 )
    public double distance(Point point) {
        return Math.sqrt(   (Math.pow((point.getX()-this.x), 2))  -  (Math.pow((point.getY()-this.y), 2))  );
    }
    
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
