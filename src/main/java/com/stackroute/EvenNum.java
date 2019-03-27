package com.stackroute;

public class EvenNum {
    public boolean isEven(int inputNum) {
        if (inputNum == 0) {
            return false;
        } else {
            if (inputNum % 2 == 0)
                return true;
            else return false;
        }
    }
}
