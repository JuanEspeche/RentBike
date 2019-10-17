/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentbike;

import java.util.ArrayList;
import java.util.List;
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
public class FamilyRentalTest {

    public FamilyRentalTest() {
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
     * Test of getRentals method, of class FamilyRental.
     */
    @Test
    public void testGetRentals() {
        System.out.println("getRentals");
        FamilyRental instance = new FamilyRental();
        List<Rental> expResult = new ArrayList();
        List<Rental> result = instance.getRentals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addRentals method, of class FamilyRental.
     */
    @Test
    public void testAddRentals() {
        System.out.println("addRentals");
        Rental rental = null;
        FamilyRental instance = new FamilyRental();
        instance.addRentals(rental);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotalCost method, of class FamilyRental.
     */
    @Test
    public void testGetTotalCost() {
        System.out.println("getTotalCost");
        FamilyRental instance = new FamilyRental();
        Rental hour = new HourlyRental(0, 5.0); //25.0
        Rental day = new DailyRental(0, 5.0); //100.0
        Rental week = new WeeklyRental(0, 5.0); //300.0
        instance.addRentals(hour);
        instance.addRentals(day);
        instance.addRentals(week);
        double expResult = 297.5;
        double result = instance.getTotalCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

}
