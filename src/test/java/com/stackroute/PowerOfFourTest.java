package com.stackroute;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PowerOfFourTest {
    private static PowerOfFour powerOfFour;
    @BeforeClass
    public static void setup(){
        powerOfFour=new PowerOfFour();
    }
    @AfterClass
    public static void teardown(){
        powerOfFour=null;
    }


    @Test
    public void testIsPower(){
        assertEquals("Check the method",true,powerOfFour.isPower(64));
        assertEquals("Check the method",false,powerOfFour.isPower(2147483644));
        assertNotNull("Check the method",powerOfFour.isPower(4));
    }
    @Test
    public void testIsPowerFailure(){
        assertEquals("Check the method",false,powerOfFour.isPower(0));
        assertNotEquals("Check the method",true,powerOfFour.isPower(2147483647));
        assertEquals("Check the method",false,powerOfFour.isPower(32));
        assertEquals("Check the method",false,powerOfFour.isPower(128));
    }
    @Test
    public void testIsPowerMisc(){
        assertEquals("Check the method",false,powerOfFour.isPower(-12));
        assertEquals("Check the method",false,powerOfFour.isPower(-4));
        assertEquals("Check the method",true,powerOfFour.isPower(1));
    }
}
