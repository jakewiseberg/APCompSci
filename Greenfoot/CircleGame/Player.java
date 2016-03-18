import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Circles
{
    public void act() {
        move();
    }
    
    @Override
    public void move() {
        int speed = 2;
        if (Greenfoot.isKeyDown("space"))
            speed = 4;
        if (Greenfoot.isKeyDown("w")) {
            setRotation(90);
            move(-speed);
        }
        if (Greenfoot.isKeyDown("s")) {
            setRotation(90);
            move(speed);
        }
        if (Greenfoot.isKeyDown("a")) {
            setRotation(0);
            move(-speed);
        }
        if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
            move(speed);
        }
    }
}
