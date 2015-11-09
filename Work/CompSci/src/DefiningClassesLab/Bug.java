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
    private int direction;
    
    public Bug(int initialPosition) {
        position = initialPosition;
        direction = 1;
    }
    
    public int getPosition() {
        return position;
    }
    
    public void move() {
        position = position+direction;
    }
    public void turn() {
        direction = -direction;
    }
    
}
