public class Using_Finally_Block {
    public static void main(String[] args) {
        int a[] = {5,10};
        int b = 5;
        try {
            int x = a[2]/b-a[1];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
        catch (ArrayStoreException e){
            System.out.println("Wrong datatype");
        }
        finally {
            int y = a[1]/a[0];
            System.out.println("Used Finally Block Here");
            System.out.println("Y = "+y);
        }
    }
}
