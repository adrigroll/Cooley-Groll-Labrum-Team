/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gjwsi
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
        int landPrice = 0;
        int acresToBuy = 0;
        CropData thedata = null;
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, thedata);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        int setOffering = 0;
        CropData thedata = null;
        int expResult = 0;
        int result = CropControl.setOffering(setOffering, thedata);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int setWheatForFood = 0;
        int setWheatInStore = 0;
        int setpopulation = 0;
        CropData thedata = null;
        int expResult = 0;
        int result = CropControl.feedPeople(setWheatForFood, setWheatInStore, setpopulation, thedata);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        int acresToPlant = 0;
        int acresOwned = 0;
        int wheatInStore = 0;
        CropData cropData = null;
        CropControl instance = new CropControl();
        int expResult = 0;
        int result = instance.plantCrops(acresToPlant, acresOwned, wheatInStore, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
