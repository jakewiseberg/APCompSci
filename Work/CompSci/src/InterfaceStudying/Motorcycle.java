/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceStudying;

/**
 *
 * @author jakew
 */
public class Motorcycle implements Automobile { //this class implements Automobile, it MUST contain at least the classes defined in Automobile
    int speed;
    public Motorcycle(){ speed = 0; }
    
    public boolean drive(int speed) {
        if (speed <= TOP_SPEED) {
            System.out.println("VROOOOOOOOOOOOOOOM");
            return true;
        }
        return false;
    }
    public int getSpeed() {
        return speed;
    }
    public double[] tirePressure() {
        double[] pressures = {Math.random(), Math.random()};
        return pressures;
    }
}
