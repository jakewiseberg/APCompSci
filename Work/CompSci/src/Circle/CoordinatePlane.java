package Circle;

/**
 *
 * @author jacob.wiseberg
 */
public class CoordinatePlane {
    public static void main(String[] args) {
        
        Circle a = new Circle(new Point(Math.random()*100, Math.random()*100), 5);
        Circle b = new Circle(new Point(Math.random()*100, Math.random()*100), 5);
        
        while (a.overlaps(b)) {
            System.out.println("OVERLAP");
            b.getCenter().setX(Math.random()*100);
            b.getCenter().setY(Math.random()*100);
        }
    }
    
    //tanslates the given circle upwards x amount
    public static void tranlateUp(Circle b, int x) {
        for (int i=0;i<x;i++) {
            b.getCenter().setY(b.getCenter().getY() + 1);
        }
    }
}
