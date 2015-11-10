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
    
    public double distance(Point x) {
        return Math.sqrt(  (Math.pow((x.getX()-this.getX()), 2))  -  (Math.pow((x.getY()-this.getY()), 2))  );
    }
    
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
