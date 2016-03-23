import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends World
{
    Player p1 = new Player();
    Enemies e1 = new Enemies(p1);
    
    public Plane()
    {    
        super(600, 400, 1); 
        addObject(p1, this.getWidth()/2, this.getHeight()/2);
        addObject(e1, 10, 10);
    }
    
    public void act() {
        if (e1.isTouching())
            removeObject(p1);
    }
    
    public void populateEnemies() {
        
    }
}
