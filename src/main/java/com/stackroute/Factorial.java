package com.stackroute;

public class Factorial {

    public long longFactorial(int input){
        long fact=1;
        for(int i=1;i<=input;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public int intFactorial(int input){

        int fact=1;
        for(int i=1;i<=input;i++)
        {
            fact=fact*i;
        }
        return fact;
    }


}