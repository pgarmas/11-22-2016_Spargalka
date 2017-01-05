/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spargalka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author polina.garmas
 */
public class SpargalkaTest {
    
    public SpargalkaTest() {
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
     * Test of square method, of class Spargalka.
     */
    @Test
    public void testSquare() {
        System.out.println("square");
        int side = 2;
        int expResult = 4;
        int result = Spargalka.square(side);
        assertEquals(expResult, result);
    }

    /**
     * Test of rectangle method, of class Spargalka.
     */
    @Test
    public void testRectangle() {
        System.out.println("rectangle");
        int width = 3;
        int length = 5;
        int expResult = 15;
        int result = Spargalka.rectangle(width, length);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCircle () {
        System.out.println("circle");
        int radius = 3;
        float expResult = 28.27f;
        float result = Spargalka.circle(radius);
        assertEquals(expResult, result,0.01f);
    }
    

    /**
     * Test of getSasha method, of class Spargalka.
     */
    @Test
    public void testGetSasha() {
        System.out.println("getSasha");
        String expResult = "Саша";
        String result = Spargalka.getSasha();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTotalCost method, of class Spargalka.
     */
    @Test
    public void testGetTotalCost_q50_return50() {
        System.out.println("getTotalCost");
        int quantity = 50;
        Spargalka instance = new Spargalka();
        float expResult = 50.0f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }
    
    @Test
    public void testGetTotalCost_q150_return135() {
        System.out.println("getTotalCost");
        int quantity = 150;
        Spargalka instance = new Spargalka();
        float expResult = 135.0f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }
    
    @Test
    public void testGetTotalCost_q550_return440() {
        System.out.println("getTotalCost");
        int quantity = 550;
        Spargalka instance = new Spargalka();
        float expResult = 440.0f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }
    
    
    @Test
    public void testGetTotalCost_q99_return99() {
        System.out.println("getTotalCost");
        int quantity = 99;
        Spargalka instance = new Spargalka();
        float expResult = 99.0f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }
    
    @Test
    public void testGetTotalCost_q100_return90() {
        System.out.println("getTotalCost");
        int quantity = 100;
        Spargalka instance = new Spargalka();
        float expResult = 90.0f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }
    
    @Test
    public void testGetTotalCost_q101_return90_9() {
        System.out.println("getTotalCost");
        int quantity = 101;
        Spargalka instance = new Spargalka();
        float expResult = 90.9f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }    
    
    @Test
    public void testGetTotalCost_q499_return449_1() {
        System.out.println("getTotalCost");
        int quantity = 499;
        Spargalka instance = new Spargalka();
        float expResult = 449.1f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }    
    
    @Test
    public void testGetTotalCost_q500_return400() {
        System.out.println("getTotalCost");
        int quantity = 500;
        Spargalka instance = new Spargalka();
        float expResult = 400.0f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    } 
    
    @Test
    public void testGetTotalCost_q501_return400_8() {
        System.out.println("getTotalCost");
        int quantity = 501;
        Spargalka instance = new Spargalka();
        float expResult = 400.8f;
        float result = instance.getTotalCost(quantity);
        assertEquals(expResult, result, 0.01f);
    }    
}
    
