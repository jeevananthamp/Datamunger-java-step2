package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class StudentGradeTest {
    private static StudentGrade studentGrade;
    @BeforeClass
    public static void setup(){
        studentGrade=new StudentGrade();
    }
    @AfterClass
    public static void teardown(){
        studentGrade=null;
    }
    @Test
    public void testAverage(){
        assertEquals(81.50,studentGrade.average(new int[]{86,65,98,77}),0.0000000001);
        assertNotEquals("Check average",90,studentGrade.average(new int[]{90,91,89}));
        assertNotNull("Check the method",studentGrade.average(new int[]{1,2,3,4,5,6,7,8,9}));

    }
    @Test
    public void testMin(){
        assertEquals("Check min",65,studentGrade.min(new int[]{86,65,98,77}));
        assertNotEquals("Check min",91,studentGrade.min(new int[]{90,91,89}));
        assertNotNull("Check the method",studentGrade.average(new int[]{1,2,3,4,5,6,7,8,9}));
    }
    @Test
    public void testMax(){
        assertEquals("Check max",98,studentGrade.max(new int[]{86,65,98,77}));
        assertNotEquals("Check max",90,studentGrade.max(new int[]{90,91,89}));
        assertNotNull("Check the method",studentGrade.average(new int[]{1,2,3,4,5,6,7,8,9}));
    }
    @Test
    public void testMisc(){
        assertNotEquals("Check min",2,studentGrade.min(new int[]{1,2,8,6}));
        assertNotEquals("Check max",2,studentGrade.max(new int[]{-1,2,5,-7}));
        assertEquals(100.00,studentGrade.average(new int[]{100,100,100}),0.0001);
        assertEquals(0.00,studentGrade.average(new int[]{0,0,0}),0.00001);
    }

}
