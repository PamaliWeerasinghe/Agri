
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class validationModelTest {
    
    public validationModelTest() {
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
     * Test of textValidation method, of class validationModel.
     */
    @Test
    public void testTextValidation() {
        System.out.println("textValidation");
        String text = "abc";
        boolean expResult = false;
        boolean result = validationModel.textValidation(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mobileValidation method, of class validationModel.
     */
    @Test
    public void testMobileValidation() {
        System.out.println("mobileValidation");
        String text = "0771231078/";
        boolean expResult = true;
        boolean result = validationModel.mobileValidation(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of emailValidation method, of class validationModel.
     */
    @Test
    public void testEmailValidation() {
        System.out.println("emailValidation");
        String text = "john_mark@gmail.com";
        boolean expResult = false;
        boolean result = validationModel.emailValidation(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of numericValidation method, of class validationModel.
     */
    @Test
    public void testNumericValidation() {
        System.out.println("numericValidation");
        String text = "123a45";
        boolean expResult = false;
        boolean result = validationModel.numericValidation(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
