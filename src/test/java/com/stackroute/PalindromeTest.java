package com.stackroute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {
    private static Palindrome palindrome;
    @BeforeClass
    public static void setup(){
        palindrome=new Palindrome();
    }
    @AfterClass
    public static void teardown(){
        palindrome=null;
    }
    @Test
    public void testCheckPalindrome(){
        assertNotNull("Check the method",palindrome.CheckPalindrome("121"));

        assertEquals("Check the method",true,palindrome.CheckPalindrome("aa"));

        assertEquals("Check the method",true,palindrome.CheckPalindrome("aba"));
    }
    @Test
    public void testCheckPalindromeFailure() {
        assertEquals("Check the method", false, palindrome.CheckPalindrome("ab"));

        assertEquals("Check the method", false, palindrome.CheckPalindrome("qwertewq"));

        assertEquals("Check the method", false, palindrome.CheckPalindrome("123210"));

    }
    }

