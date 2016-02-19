package Interfaces;

/**
 *
 * @author jacob.wiseberg
 */
public interface Motorvehicle {
    void drive();
    void brake();
    boolean gas();
    int[] tirePressure();
    void honk();
    String licensePlate();
}