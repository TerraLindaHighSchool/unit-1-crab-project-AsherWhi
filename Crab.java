import greenfoot.*;

/**
 * This class controls the Crab object
 * @author: Asher White
 * @version 8/30/2021
*/
public class Crab extends Actor
{
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
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
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }  
        // Checks for collisions with other objects
    }
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            
            // Winning the game
            if(getWorld().getObjects(Worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
             
        }
    }
}
