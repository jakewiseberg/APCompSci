package InterfaceStudying;

/**
 *
 * @author jakew
 */
public class Highway {
    public static void main(String[] args) {
        //this cool part about interfaces is that there can be arrays with multiple objects that implement the same interface
        //the thing is, these items will ONLY have the methods that the interface contains
        Automobile[] highway = new Automobile[3];
        
        //cars AND motorcycles woah
        Car ford = new Car();
        Motorcycle harley = new Motorcycle();
        Car bmw = new Car();
        
        //assignments yea
        highway[0] = ford;
        highway[1] = harley;
        highway[2] = bmw;
        
        //some methods
        highway[0].drive(54);
        System.out.println(highway[2].drive(70));
        
        //casting
        Automobile honda = new Car();
        Automobile yamaha = (Motorcycle)honda;
        honda.drive(20);
        yamaha.drive(20);
    }
}
