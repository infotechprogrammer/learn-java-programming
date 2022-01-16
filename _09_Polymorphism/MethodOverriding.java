class Super {
    int x;
    Super(int x) {
        this.x = x;
    }
    void display() {  // Method defined once
        System.out.println("Super x = "+x);
    }
}

class Sub extends Super {
    int y;
    Sub(int x, int y) {
        super(x);
        this.y = y;
    }
    void display() {  // method defined again (Method Overriding)
        System.out.println("Super x = "+x);
        System.out.println("Super y = "+y);
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        Sub s1 = new Sub(100,200);
        s1.display();
    }
}
