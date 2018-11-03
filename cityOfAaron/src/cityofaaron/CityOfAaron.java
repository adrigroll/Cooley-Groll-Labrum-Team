/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */

package cityofaaron;

import model.*;
import view.*;

public class CityOfAaron {

    private static Game theGame = null;

    private static int dozen;
    private static int cropData;


    /**
     * @param args the command line arguments
     */
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();       


        // TODO code application logic here
        Player player = new Player();
        player.setName("Ben The Brave");
                
        Game game = new Game();
        game.setPlayer(player);
        System.out.println(game.getPlayer().getName());
        
        Game myGame = new Game();
        myGame.setPlayer(player);
        myGame.setCropData(cropData);
        myGame.setAnimals(1);
        myGame.setTools(2);
        myGame.setProvisions(3);
        System.out.println(myGame.getPlayer());
        System.out.println(myGame.getCropData());
        System.out.println(myGame.getAnimals());
        System.out.println(myGame.getTools());
        System.out.println(myGame.getProvisions());
        
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
        cropData.setAcresOwned(8);
        cropData.setwheatInStore(9);
        cropData.setCropYield(10);
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

    public static void setGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  



  


