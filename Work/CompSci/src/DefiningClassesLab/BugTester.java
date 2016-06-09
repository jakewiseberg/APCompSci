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
public class BugTester {
    public static void main(String[] args) {
        Bug bugsy = new Bug(0);
        
        System.out.println("\nBugsy's initial position: " + bugsy.getPosition()+ "\n");
        
        bugsy.move();
        System.out.println("Bugsy just moved!!");
        System.out.println("Expected position: 1");
        System.out.println("Returned position: " + bugsy.getPosition() + "\n");
        
        bugsy.turn();
        System.out.println("Bugsy just turned!!!\n");
        
        bugsy.move();
        System.out.println("Bugsy just moved again!!!");
        System.out.println("Expected position: 0");
        System.out.println("Current position: " + bugsy.getPosition()+ "\n");
        
        bugsy.move();
        System.out.println("Bugsy just moved again!!!");
        System.out.println("Expected position: -1");
        System.out.println("Current position: " + bugsy.getPosition()+ "\n");
        
        bugsy.move();
        System.out.println("Bugsy just moved again!!!");
        System.out.println("Expected position: -2");
        System.out.println("Current position: " + bugsy.getPosition()+ "\n");
        
        bugsy.turn();
        System.out.println("Bugsy just turned!!!\n");
        
        bugsy.move();
        System.out.println("Bugsy just moved again!!!");
        System.out.println("Expected position: -1");
        System.out.println("Current position: " + bugsy.getPosition()+ "\n");
    }
}
