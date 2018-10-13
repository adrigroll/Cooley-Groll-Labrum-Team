/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */
package model;

/**
 *
 * @author theag
 */
public class CropData {
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;
    

    public CropData (){}
        
    public int getNumberWhoDied()
    {
	return numberWhoDied;
    }
	
    public int getNewPeople()
    {
	return newPeople;
    }    
    
        public int getHarvest()
    {
	return harvest;
    }
	
    public int getWheatForFood()
    {
	return wheatForFood;
    }
   
    public int getAcresPlanted()
    {
	return acresPlanted;
    }
    
    public void setNumberWhoDied(int _numberWhoDied)
    {
        numberWhoDied = _numberWhoDied;
    }
    
    public void setnewPeople(int _newPeople)
    {
        newPeople = _newPeople;
    }
    
    public void setHarvest(int _harvest)
    {
        harvest = _harvest;
    }
    
    public void setWheatForFood(int _wheatForFood)
    {
        wheatForFood = _wheatForFood;
    }  

    public void setAcresPlanted(int _acresPlanted)
    {
        acresPlanted = _acresPlanted;
    } 
    
}
