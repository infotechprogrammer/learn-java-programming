package com._10_Abstraction;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Draw Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw Circle");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        s1.draw();
        s2.draw();
    }
}
