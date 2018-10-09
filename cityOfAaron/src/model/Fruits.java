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
public enum Fruits {
     // The members of the enumeration
    APPLE("Apple", "red"),
    BANANA("Banana", "yellow"),
    PLUMB("Plumb", "purple");

    
    //data members
    private String name;
    private String color;
    
    
     // Public constructor
 // Purpose: initializes the values of name and color
 // Parameters: the name of the fruit and its color
 // Returns: none
 Fruits(String _name, String _color)
 {
     name = _name;
     color = _color;
 }
    // The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return name;
    }
   public String getColor()
    {
        return color;
    }

}
