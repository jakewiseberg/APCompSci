import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FreeRoam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FreeRoam extends World
{

    /**
     * Constructor for objects of class FreeRoam.
     * 
     */
    public FreeRoam() {
        super(600, 400, 1);
        Player p1 = new Player();
        Ground g = new Ground();
        addObject(p1, 200, 200);
        addObject(g, 0, 500);
    }
}
