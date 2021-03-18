import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (Hunter) 
 * @version (March 16 version 1)
 */
public class Lobster extends Actor
{
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move ();
        lookForCrab();
    }
    
    public void move( )
    {
        move(5);
    }
    /*
     *  If Lobster comes in contact with worm it eats it. 
     *  If it does not, it continues to go along until all worms are gone.
     */
    public void lookForCrab()
    {
        if (isTouching(Crab.class) )
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    /*
     * Make the Lobster make random turns left or right
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
     * When the Lobster is at the world's edge turn.
     */
    public void turnAtEdge()
    {
        if (isAtEdge() )
        {
           turn(17); 
        }
    }
}
