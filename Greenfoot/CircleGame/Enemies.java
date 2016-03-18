import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Circles
{
    private int speed;
    public void act() 
    {
       move();
    }
    
    @Override
    public void move() {
        speed = (int)(Math.random()*3);
        while (!super.atEdge()) {
            move(speed);
        }
        
    }
}
