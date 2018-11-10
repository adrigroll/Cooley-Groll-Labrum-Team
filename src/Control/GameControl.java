/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import model.*;
import cityofaaron.CityOfAaron;

/**
 *
 * @author theag
 */
public class GameControl {
  public static void createNewGame(String _name)  
  {
       // create the game object
        Game game = new Game();
        
        // create the player object and set the name
        Player player = new Player();
        player.setName(_name);
        
        // save reference to the player object in the game
        game.setPlayer(player);
// create and initialize a CropData object
// save a reference to it in the Game object
        CropData cropData = new CropData();
        
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000); 
        
        game.setCropData(cropData); 
        
        // when all is done, save a reference to the Game object
        CityOfAaron.setGame(game);

   
  }        
}
