package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
public class FactorialTest {
   private static Factorial factorial;

   @BeforeClass
    public static void setup(){
       factorial=new Factorial();
   }

   @AfterClass
    public static void teardown(){
       factorial=null;
   }

   @Test
    public void testIntFact(){
       assertEquals("Check int method",479001600,factorial.intFactorial(12));
       assertEquals("Check int method",24,factorial.longFactorial(4));
       assertNotEquals("Check int method",0,factorial.longFactorial(1));
   }
   @Test
    public void testLongFact(){
       assertEquals("Check long method",6227020800L,factorial.longFactorial(13));
       assertEquals("Check long method",2,factorial.longFactorial(2));
       assertNotEquals("Check long method",0,factorial.longFactorial(1));
   }
   @Test
    public void testFactMisc(){
       assertEquals("Check the int method",1,factorial.longFactorial(0));
       assertEquals("Check the int method",1,factorial.intFactorial(0));
       assertNotNull("Check the long method",factorial.longFactorial(13));
       assertNotEquals("Check the int method",2,factorial.intFactorial(-2));
       assertNotEquals("Check the long method",6,factorial.intFactorial(-3));
   }
}
