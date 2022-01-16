package com._09_Polymorphism;

class Vehicle {
    void speed() {
        System.out.println("Vehicle Speeds :");
    }
}

class Bike extends Vehicle {
    int x;
    void speed(int a) {
        x = a;
        System.out.println("Bike Speed = "+x+"km/h");
    }
}

class Car extends Bike {
    int x,y;
    void speed(int a, int b) {
        x = a;
        y = b;
        System.out.println("Normal Car Speed = "+x+"km/h");
        System.out.println("Sports Car Speed = "+y+"km/h");
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Car obj = new Car();
        obj.speed();
        obj.speed(90);
        obj.speed(120,190);
    }
}
