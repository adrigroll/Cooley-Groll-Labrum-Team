/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CropControl;

import CropControl.*;
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

    }
    
    
    
}
