/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalLabs;

/**
 *
 * @author jakew
 */
public class ViableCar {
    public static void main(String[] args) {
        System.out.println(viableCar(29, 5, true));
    }
    
    public static boolean viableCar(int mpg, int pass, boolean conv) {
        if (mpg>=30 && pass>=5) return true;
        else if (mpg>=30 && pass<5 && conv)  return true;
        else return false;
    }
}
