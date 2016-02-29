package InterfaceStudying;

/**
 *
 * @author jakew
 */
public interface Automobile { // <-- that's how you create a new interface
    //to have an interface of an interface, use extends
    //all constants and methods are public in interfaces
    //contants are like instance variables but they are declared and cannot be changed
    int TOP_SPEED = 55; // <-- this cannot be changed when implemented into a class, it is aready PUBLIC
    //methods are only declared, no code is written
    boolean drive(int speed);
    int getSpeed();
    double[] tirePressure();
}
