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
        Player player = new Player();
        player.setName("Ben The Brave");
                
        Game game = new Game();
        game.setPlayer(player);   
        System.out.println(TeamMember.BEN.getName() + " - " + TeamMember.BEN.getTitle());
    }
  
    
    
    //data members
    private final String name;
    private final String title;
    
    
     // Public constructor
 // Purpose: initializes the values of name and color
 // Parameters: the name of the fruit and its color
 // Returns: none
 TeamMember(String _name, String _title)
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
  


