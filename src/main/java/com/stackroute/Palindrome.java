package com.stackroute;

public class Palindrome {
    public boolean CheckPalindrome(String checkString) {
        if (checkString.matches("^[a-zA-Z0-9]")) {
            return false;
        }
        else{
            String reverse = new StringBuffer(checkString).reverse().toString();
            // check whether the string is palindrome or not
            if (checkString.equals(reverse))
                return true;
            else
                return false;

        }

    }
}
