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
    
    /* Ben's Part*/
    private int year;
    private int population;
    private int acresOwned;
    private int wheatInStore;
    private int cropYield;

     public CropData (){}
        
    public int getYear()
    {
	return year;
    }

public int getPopulation()
    {
	return population;
    }

public int getAcresOwned()
    {
	return acresOwned;
    }

    public int WheatInStore()
    {
	return wheatInStore;
    }
    
        public int getCropYield()
    {
	return cropYield;
    }
    
        /*Adriane*/
      
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
    
    /*Addriane*/
    
    public void setNumberWhoDied(int _numberWhoDied)
    {
        numberWhoDied = _numberWhoDied;
    }
    
    public void setNewPeople(int _newPeople)
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
    
    public void setWheatInStore(int _wheatInStore)
    {
        wheatInStore = _wheatInStore;
    }
    
    /*Ben*/
    
        public void setYear(int _year)
    {
        year = _year;
    }

    public void setPopulation(int _population)
    {
        population = _population;
    }

public void setacresOwned(int _acresOwned)
    {
        acresOwned = _acresOwned;
    }

public void setcropYield(int _cropYield)
    {
        cropYield = _cropYield;
    }

public void setwheatInStore(int _wheatInStore)
    {
        wheatInStore = _wheatInStore;
    } 

    public boolean getWheatInStore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }