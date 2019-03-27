package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class MemberTest {
    private static  MemberVariable member;
    @BeforeClass
    public static void setup(){
        member=new MemberVariable();
    }
    @AfterClass
    public static void teardown(){
        member=null;
    }
    @Test
    public void testName(){
        assertEquals("Check the name","Harry Potter",member.getName("Harry Potter"));
        assertNotEquals("Check the name method","aaa",member.getName("aa"));
    }
    @Test
    public void testAge(){
        assertNotEquals("Check the age method",5,member.getAge(25));
        assertEquals("Check the age method",5,member.getAge(5));
    }
    @Test
    public void testSalary(){
        assertEquals(25000.00,member.getSalary(25000.00),0.000001);
        assertEquals(200000.00,member.getSalary(200000.00),0.00001);
        assertNotNull("Check salary",member.getSalary(78000));
    }

    @Test
    public void testMisc(){
        assertNotEquals("return 0.00 for negative values in salary method",-10000,member.getSalary(-10000));
        assertEquals(0.00,member.getSalary(-789456),0.000001);
        assertEquals("return null in a string if given input is empty","null",member.getName(""));
        assertEquals("return 0 if the age is negative",0,member.getAge(-99));

    }


}
