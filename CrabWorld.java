import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,120,186);
        Worm worm = new Worm();
        addObject(worm,254,72);
        Worm worm2 = new Worm();
        addObject(worm2,343,260);
        Worm worm3 = new Worm();
        addObject(worm3,184,400);
        Worm worm4 = new Worm();
        addObject(worm4,446,449);
        Worm worm5 = new Worm();
        addObject(worm5,40,300);
        Worm worm6 = new Worm();
        addObject(worm6,56,58);
        Worm worm7 = new Worm();
        addObject(worm7,480,98);
        Worm worm8 = new Worm();
        addObject(worm8,239,531);
        Lobster lobster = new Lobster();
        addObject(lobster,352,384);
    }
}