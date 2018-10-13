/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */

package cityofaaron;

import model.*;
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
        System.out.println(game.getPlayer().getName());
        
        System.out.println(TeamMember.BEN.getName() + " - " + TeamMember.BEN.getTitle());
        
        Location joe = new Location();
        joe.setDescription("China");
        joe.setSymbol("CH");
        System.out.println(joe.getDescription());
        System.out.println(joe.getSymbol());
        
        //CropData cropData = new CropData();
        //cropData.setNumberWhoDied("1");
        //cropData.setNewPeople("2");
        //cropData.setHarvest("3");
        //cropData.setWheatForFood("4");
        //cropData.setAcresPlanted("5");
        //System.out.println(cropData.setNumberWhoDied());
        //System.out.println(cropData.setNewPeople());
        //System.out.println(cropData.setHarvest());
        //System.out.println(cropData.setWheatForFood());
        //System.out.println(cropData.setAcresPlanted());
        
    }
  
    

}
  


