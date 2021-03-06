/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author gjwsi
 */

public class CropView {
    
    //ADRIENNE GROLL//
    //The setOfferingView method
    // Purpose: The method to allocate a percentage of the harvest to be paid as an offering
    // Parameters: none
    // Returns: none
    //Stores: setOffering in the CropData object
    
    public void setOfferingView() 
    {
        Scanner keyboard = new Scanner(System.in);


    int offering = CropControl.setOffering();
    
    system.out.println("\nWhat percentage of the harvest do you want to pay as an offering?");
            
        //  Get the user’s input and save it.
        int offering;
        offering = keyboard.nextInt();
        
        CropControl.setOffering(offering, cropData);
            } 
    
    // The buyLandView method
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none
    public static void buyLandView() {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        System.out.print("\nHow many acres of land do you wish to buy?");

        //  Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();
        
        CropControl.buyLand(price, toBuy, cropData);
        }
    
}
