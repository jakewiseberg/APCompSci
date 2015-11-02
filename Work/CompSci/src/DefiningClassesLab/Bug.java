/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefiningClassesLab;

/**
 *
 * @author jakew
 */
public class Bug {
    private int position;
    
    public Bug(int initialPosition) {
        position = initialPosition;
    }
    
    public int getPosition() {
        return Math.abs(position);
    }
    
    public void move() {
        position = position+1;
    }
    public void turn() {
        position = -position;
    }
    
}
