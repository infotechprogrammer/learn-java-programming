// Program to see concept of default and parameterized constructor

class perimeter {
    int length;
    int breadth;
    perimeter() {
        length = 0;
        breadth = 0;
    }
    perimeter(int x, int y) {
        length = x;
        breadth = y;
    }
    void cal_perimeter() {
        int peri;
        peri = 2* (length + breadth);
        System.out.println("\nPerimeter of Rectangle is: "+peri);
    }
}

class default_c {
    public static void main(String args[]) {
        perimeter p1 = new perimeter();
        perimeter p2 = new perimeter(5,10);
        p1.cal_perimeter();
        p2.cal_perimeter();
    }
}
