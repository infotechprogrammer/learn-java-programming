class MathOperation {
    static float mul(float x, float y) {
        return x*y;
    }
    static float divide(float x, float y) {
        return x/y;
    }
}

class MathApplication {
    public static void main(String args[]) {
        float a = MathOperation.mul(4.0f,5.0f);
        float b = MathOperation.divide(a,2.0f);
        System.out.println("B = "+b);
    }
}
