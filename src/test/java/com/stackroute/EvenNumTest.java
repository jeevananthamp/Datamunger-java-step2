package com.stackroute;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EvenNumTest {
    private static EvenNum evenNum;
    @BeforeClass
    public static void setup(){
        evenNum=new EvenNum();
    }

    public static void teardown(){
        evenNum=null;
    }

    @Test
    public void testIsEven(){

        assertEquals("Check method",true,evenNum.isEven(8));
        assertNotEquals("Check method",false,evenNum.isEven(128));
        assertEquals("Check method",true,evenNum.isEven(2147483646));
    }
    @Test
    public void testIsEvenFailure(){
        assertEquals("Check method",false,evenNum.isEven(1));
        assertNotEquals("Check method",true,evenNum.isEven(2147483647));
        assertEquals("Check method",false,evenNum.isEven(9));
    }
    @Test
    public void testIsEvenMisc(){
        assertEquals("Check method",false,evenNum.isEven(0));
        assertNotEquals("Check method",false,evenNum.isEven(-2));
        assertEquals("Check method",true,evenNum.isEven(-2147483648));
    }
}
