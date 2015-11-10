package Circle;

/**
 *
 * @author jacob.wiseberg
 */
public class CoordinatePlane {
    public static void main(String[] args) {
        Point center = new Point(2, 3.5);
        Circle a = new Circle(center , 4);
        Circle b = new Circle(2, 23.5, 4);
        Circle c = new Circle(center, 6);
        //System.out.println(a.equals(b));
        //tranlateUp(a, 20);
        //System.out.println(a.equals(b));
        System.out.println("True of false.");
        System.out.print("Are cirlces a and b overlapping? ");
        System.out.println(a.overlaps(b));
        System.out.print("Are cirlces a and c overlapping? ");
        System.out.println(a.overlaps(c));
    }
    
    //tanslates the given circle upwards x amount
    public static void tranlateUp(Circle b, int x) {
        for (int i=0;i<x;i++) {
            b.getCenter().setY(b.getCenter().getY() + 1);
        }
    }
}
