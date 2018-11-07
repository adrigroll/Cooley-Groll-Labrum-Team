package Control;

/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */


import model.CropData;
        
/**
 *
 * @author theag
 */
public class CropControl
{


/**
* The buyLand method
* Purpose: To buy land
* param the number of acres to buy
* param verify that there is enough wheatInStore for purchase
* param a reference to a CropData object
* return the number of acres left after the sale
* Pre-conditions: acres to buy must be positive
* and <= the number of acres owned
*/    
public static int buyLand(int landPrice, int acresToBuy, CropData thedata)
{
   
        //if acresToBuy < 0, return -1
    if(acresToBuy<0)
        return-1;
    
    int wheatInStore = thedata.getWheatInStore();
    //if (acresToBuy * landPrice) > wheat inStore, return -1
    if ((acresToBuy * landPrice) > wheatInStore)
            return -1;
 
    int owned = thedata.getAcresOwned();
    //acresOwned = acresOwned + acresToBuy
    owned += acresToBuy;
    thedata.setAcresOwned(owned);
    
    //wheatInStore = wheatInStore - (acresToBuy * landPrice)
    int wheat = thedata.getWheatInStore();
    wheat-= (acresToBuy * landPrice);
    thedata.setWheatInStore(wheat);

    
   //return acresOwned
    return owned;


}
    /*ADRIENNE*/

    public static int setOffering(int setOffering, CropData thedata) 
    {
        //if setOffering < 0, return-1
        if (setOffering < 0)
            return -1;
        
        //if setOffering > 100, return -1
        if (setOffering > 100)
            return -1;

        //store setOffering
        return setOffering;
    }

 /*Ben*/   
    public static int feedPeople(int setWheatForFood, int setWheatInStore, int setpopulation, CropData thedata)
    
    {
        if (setWheatInStore < 0)
             return -1;

        if (setWheatForFood > setWheatInStore)
            return -1;

        return setWheatInStore;
    }    

    }    


