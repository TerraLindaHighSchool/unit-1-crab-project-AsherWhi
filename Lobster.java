import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lobster is an enemy.
 * 
 * @author Asher White 
 * @version 9/2/2021
 */
public class Lobster extends Actor
{
    public void act()
    {
        move(3);
        turnAtEdge();
    }

    // Moves the Crab
    
    // Turns the crab
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(-50);
        }
    }
}
