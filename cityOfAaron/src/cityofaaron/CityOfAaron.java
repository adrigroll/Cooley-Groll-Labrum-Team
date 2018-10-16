/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */

package cityofaaron;

import model.*;
public class CityOfAaron {

    private static int dozen;

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
        
        CropData cropData = new CropData();
        cropData.setNumberWhoDied(1);
        cropData.setNewPeople(2);
        cropData.setHarvest(3);
        cropData.setWheatForFood(4);
        cropData.setAcresPlanted(5);
        cropData.setYear(6);
        cropData.setPopulation(7);
        cropData.setacresOwned(8);
        cropData.setwheatInStore(9);
        cropData.setcropYield(10);
        System.out.println(cropData.getNumberWhoDied());
        System.out.println(cropData.getNewPeople());
        System.out.println(cropData.getHarvest());
        System.out.println(cropData.getWheatForFood());
        System.out.println(cropData.getAcresPlanted());
        System.out.println(cropData.getYear());
        System.out.println(cropData.getPopulation());
        System.out.println(cropData.getAcresOwned());
        System.out.println(cropData.getWheatInStore());
        System.out.println(cropData.getCropYield());        
     
        ListItem apple = new ListItem();
        apple.setName("Granny Smith");
        apple.setNumber(dozen);
        System.out.println(apple.getName());
        System.out.println(apple.getNumber());
        
    }
  
    

}
  


