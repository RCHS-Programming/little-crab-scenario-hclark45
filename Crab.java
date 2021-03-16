import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        turnAtEdge();
        randomTurn();
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
        }
    }
    
    /*
     * Make the Crab make random turns left or right
     * between 0 and 45 degrees.
     */
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(91)-45);
            
         
        }
    }
    
    /*
     * When the crab is at the world's edge turn.
     */
    public void turnAtEdge()
    {
        if (isAtEdge() )
        {
           turn(17); 
        }
    }
}
