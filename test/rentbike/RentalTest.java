/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentbike;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanl
 */
public class RentalTest {

    public RentalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getQuantity method, of class Rental.
     */
    

    /**
     * Test of setQuantity method, of class Rental.
     */
   

    /**
     * Test of setUnitCost method, of class Rental.
     */
    @Test
    public void testSetUnitCost() {
        System.out.println("setUnitCost");
        double unitCost = 5.0;
        Rental instance = new RentalImpl();
        instance.setUnitCost(unitCost);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getUnitCost method, of class Rental.
     */
    @Test
    public void testGetUnitCost() {
        System.out.println("getUnitCost");
        Rental instance = new RentalImpl();
        instance.setUnitCost(5.0);
        double expResult = 5.0;
        double result = instance.getUnitCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotalTime method, of class Rental.
     */
    @Test
    public void testGetTotalTime() {
        System.out.println("getTotalTime");
        Rental instance = new RentalImpl();
        instance.setTotalTime(5.0);
        double expResult = 5.0;
        double result = instance.getTotalTime();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTotalTime method, of class Rental.
     */
    @Test
    public void testSetTotalTime() {
        System.out.println("setTotalTime");
        double totalTime = 5.0;
        Rental instance = new RentalImpl();
        instance.setTotalTime(totalTime);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotalCost method, of class Rental.
     */
    @Test
    public void testGetTotalCost() {
        System.out.println("getTotalCost");
        Rental instance = new RentalImpl();
        instance.setUnitCost(5.0);
        instance.setTotalTime(5.0);
        double expResult = 25.0;
        double result = instance.getTotalCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class RentalImpl extends Rental {
    }

}
