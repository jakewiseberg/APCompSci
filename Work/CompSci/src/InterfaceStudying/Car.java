package InterfaceStudying;

/**
 *
 * @author jakew
 */
public class Car implements Automobile {
    int speed;
    public Car() {
        speed = 0;
    }
    public boolean drive(int speed) {
        if (speed <= TOP_SPEED) {
            System.out.println("ROOOOM");
            this.speed = speed;
            return true;
        }
        return false;
    }
    public int getSpeed() {
        return speed;
    }
    public double[] tirePressure() {
        double[] pressures = {Math.random(), Math.random(), Math.random(), Math.random()};
        return pressures;
    }
}
