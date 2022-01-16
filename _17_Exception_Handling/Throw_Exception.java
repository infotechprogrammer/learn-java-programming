package com._17_Exception_Handling;

class Throwing_own_exception extends Exception {
    Throwing_own_exception(String message) {
        super(message);
    }
}

public class Throw_Exception {
    public static void main(String[] args) {
        int x=5, y=1000;
        try {
            float z = (float)x / (float)y;
            if(z<0.01) {
                throw new Throwing_own_exception("Number is too small");
            }
        }
        catch (Throwing_own_exception e) {
            System.out.println("Caught my exception");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am always here");
        }
    }
}
