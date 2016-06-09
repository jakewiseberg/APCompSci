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
    private int rotation;
    private String log;
    private int[] location;
    Player player;
    
    public Enemies(Player p) {
        speed = (int)(Math.random()*3);
        genSpecs();
        genLoc();
        player = p;
    }
    
    public void act() 
    {
       move(speed);
       eat();
       turnTowards(player.getX(), player.getY());
    }
    
    public void genSpecs() {
        rotation = (int)(Math.random()*180);
        setRotation(rotation);
    }
    
    public void genLoc() {
        location = new int[2];
        int x = (int)(Math.random()*3+1);
        switch (x) {
            case 1: location[0] = 5;
            case 2: location[0] = 600;
            case 3: location[0] = (int)(Math.random()*600);
        }
        int y = (int)(Math.random()*3+1);
        switch (x) {
            case 1: location[1] = 5;
            case 2: location[1] = 400;
            case 3: location[1] = (int)(Math.random()*400);
        }
        setLocation(location[0], location[1]);
    }
    
    public boolean isTouching() {
        if (player.getX() == getX() && player.getY() == getY())
            return true;
        return false;
    }
    
    @Override
    public void eat() {
        
    }
}
