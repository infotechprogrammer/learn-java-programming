package com._05_Constructor;

class Rectangle {
    int length, width; // Declaration of variables
    Rectangle(int x, int y) { // Definition Constructor
        length = x;
        width = y;
    }
    int rectArea() { // Definition of another method
       return (length * width);

    }
}

class RectArea {
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(15,10); // Calling Constructor
        int area1 = rect1.rectArea();
        System.out.println("Area1 = "+area1);
    }
}
