import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{   
    public void act() 
    {
        movement();
    }
    
    public void movement() {
        if (Greenfoot.isKeyDown("a"))
            move(-3);
        if (Greenfoot.isKeyDown("d"))
            move(3);
        if (Greenfoot.isKeyDown("space"))
            turn(3);
    }
}
