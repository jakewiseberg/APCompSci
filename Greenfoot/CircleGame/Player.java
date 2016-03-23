import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Circles
{
    private int speed = 2;
    private String log;
    GreenfootImage image;
    public Player() {
        image = getImage();
    }
    
    public void act() {
        move();
    }
    
    public void move() {
        speed = 2;
        if (Greenfoot.isKeyDown("space")) {
            speed += 2;
            
        }
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
    
    
    
    @Override
    public void eat() {
        image.scale(image.getWidth()+3, image.getHeight()+3);
        setImage(image);
    }
}
