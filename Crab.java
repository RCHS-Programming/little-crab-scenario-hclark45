import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    public Crab()
    {
        image1 = new GreenfootImage ("crab.png");
        image2 = new GreenfootImage ("crab2.png");
        setImage (image1);
    }
    public void act()
    {
        
        checkKeyPress();
        move ();
        lookForWorm();
    }
    
    public void move( )
    {
        move(5);
    }
    /*
     *  If crab comes in contact with worm it eats it. 
     *  If it does not, it continues to go along until all worms are gone.
     */
    public void lookForWorm()
    {
        if (isTouching(Worm.class) )
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    /*
     * Check whether a key is pressed. If so, turn the crab.
     */
    public void checkKeyPress()
    {
         if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
    }
}
