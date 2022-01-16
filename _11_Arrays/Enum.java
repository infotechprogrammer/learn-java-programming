package com._11_Arrays;

public class Enum {
    enum Days {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }

    public static void main(String[] args) {
        for(Days d : Days.values());
    }
    private static void weekend(Days d) {
        if(d.equals(Days.Sunday)) {
            System.out.println("Value ="+d+" is a Holiday");
        } else {

            System.out.println("Value ="+d+" is a Working Day");
        }
    }
}
