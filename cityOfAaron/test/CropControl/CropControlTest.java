/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CropControl;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author theag
 */
public class CropControlTest {
    
    public CropControlTest() {
    }


    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 20;
        int acresToBuy = 50;
        CropData thedata = new CropData();
        thedata.setWheatInStore(1500);
        thedata.setAcresOwned(50);
        int expResult = 100;
        int result = CropControl.buyLand(landPrice, acresToBuy, thedata);
        assertEquals(expResult, result);
        
        System.out.println("buyLand test2");
        landPrice = 30;
        acresToBuy = 100;
        
        thedata.setWheatInStore(1500);
        thedata.setAcresOwned(50);
        expResult = -1;
        result = CropControl.buyLand(landPrice, acresToBuy, thedata);
        assertEquals(expResult, result);

        System.out.println("buyLand test3");
        landPrice = 20;
        acresToBuy = -5;
        
        thedata.setWheatInStore(75);
        thedata.setAcresOwned(50);
        expResult = -1;
        result = CropControl.buyLand(landPrice, acresToBuy, thedata);
        assertEquals(expResult, result);
        
        System.out.println("buyLand test4");
        landPrice = 10;
        acresToBuy = 2000;
        
        thedata.setWheatInStore(2000);
        thedata.setAcresOwned(200);
        expResult = -1;
        result = CropControl.buyLand(landPrice, acresToBuy, thedata);
        assertEquals(expResult, result);
        
                System.out.println("buyLand test5");
        landPrice = 10;
        acresToBuy = 0;
        
        thedata.setWheatInStore(2000);
        thedata.setAcresOwned(2000);
        expResult = 2000;
        result = CropControl.buyLand(landPrice, acresToBuy, thedata);
        assertEquals(expResult, result);
    }
    
    public void testSetOffering() {
        System.out.println("setOffering");
        int setOffering = 20;
        CropData thedata = new CropData();
        thedata.setOffering (20);
        int expResult = 20;
        int result = CropControl.setOffering(setOffering, thedata);
        assertEquals(expResult, result);
        
        System.out.println("setOffering test2");
        setOffering = 50;
        thedata.setOffering (50);
        expResult = 50;
        result = CropControl.setOffering(setOffering, thedata);
        assertEquals(expResult, result);
        
        System.out.println("setOffering test3");
        setOffering = 60;
        thedata.setOffering (60);
        expResult = 60;
        result = CropControl.setOffering(setOffering, thedata);
        assertEquals(expResult, result);
        
        System.out.println("setOffering test4");
        setOffering = 28;
        thedata.setOffering (28);
        expResult = 28;
        result = CropControl.setOffering(setOffering, thedata);
        assertEquals(expResult, result);
                
        System.out.println("setOffering test5");
        setOffering = 90;
        thedata.setOffering (90);
        expResult = 90;
        result = CropControl.setOffering(setOffering, thedata);
        assertEquals(expResult, result);
    }
        
    //Ben//
    public void testFeedPeople(){    
    System.out.println("feedPeople Test 1");
        int setPopulation = 5;
        CropData thedata = new CropData();
        thedata.setWheatInStore (250);
        int setWheatforfood = 5;
        int expResult = 245;
        int result = CropControl.feedPeople(setPopulation, setWheatForFood,setWheatInStore, thedata);
        assertEquals(expResult, result);
        
     
        
        
}
}