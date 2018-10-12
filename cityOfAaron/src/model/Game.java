/*
 * The player() class file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Shayla Cooley, Adrienne Groll
 */


package model;

/**
 *
 * @author theag
 */
import java.io.Serializable;


public class Game implements Serializable {
    private final String thePlayer;
    
    
    public Game()  { }

    public Player getPlayer() 
   { 
      return thePlayer; 
   }

    public void setPlayer(Player _thePlayer)
   {
      thePlayer = _thePlayer;
   }
    
}