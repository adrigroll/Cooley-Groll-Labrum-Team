/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */

package cityofaaron;

public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public enum teamMember {
     // The members of the enumeration
    BEN("Ben","The Brave"),
    ADRIENNE("Adrienne","The Wise");
    
    
    //data members
    private final String name;
    private final String title;
    
    
     // Public constructor
 // Purpose: initializes the values of name and color
 // Parameters: the name of the fruit and its color
 // Returns: none
 teamMember(String _name, String _title)
 {
     name = _name;
     title = _title;
     
  }
 
    // The getName() method
    // Purpose: returns the value stored in name
    // Parameters: none
    // Returns: the value stored in name
    public String getName()
    {
        return name;
    }
   public String getTitle()
    {
        return title;
    }

}
     System.out.println(teamMember.BEN.getName() + " - " + teamMember.BEN.getTitle());

}
