package com._04_Class_and_Objects;

class Rectangle {
    int length, width; // Declaration of variables
    void getData(int x, int y) { // Definition of method
        length = x;
        width = y;
    }
    int rectArea() { // Definition of another method
        int area = length * width;
        return (area);
    }
} //End of class

class RectArea { //Main class
    public static void main(String args[]) {
        int area1, area2;
        Rectangle rect1 = new Rectangle(); // Creating object rect1
        Rectangle rect2 = new Rectangle(); // Creating object rect2
        rect1.length = 15; // Accessing variable
        rect1.width = 20; // Accessing variable
        area1 = rect1.length * rect1.width;
        rect2.getData(20,10); // Accessing Method
        area2 = rect2.rectArea(); // Accessing Method
        System.out.println("Area1 = "+area1);
        System.out.println("Area2 = "+area2);
    }
}
