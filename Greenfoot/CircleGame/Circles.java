import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Circles extends Actor
{
    abstract void move();
    boolean atEdge() {
        return (this.getY() > this.getWorld().getHeight()) || (this.getX() > this.getWorld().getWidth())
               || (this.getY() < 0) || (this.getX() < 0);
    }
}
