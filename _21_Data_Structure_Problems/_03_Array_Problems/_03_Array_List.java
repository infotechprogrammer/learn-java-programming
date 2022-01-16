import java.util.ArrayList;
import java.util.Scanner;

public class _03_Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Syntax
//        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(67);
        list.add(680);
        list.add(840);
        list.add(780);
        list.add(671);
        list.add(567);
        list.add(6580);
        list.add(5840);

        System.out.println(list.contains(671));
        System.out.println(list.contains(480));

        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

        ArrayList<Integer> newlist = new ArrayList<>(5);
        // Input
        System.out.println("Enter values for Array List of size 5:");
        for (int i = 0; i < 5; i++) {
            newlist.add(in.nextInt());
        }

        // Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(newlist.get(i)); // pass index here
        }

        // Initializig 2D ArrayList
        System.out.println("Enter values for Multidimensional (2D)Array List of size [3][3]:");
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2D.add(new ArrayList<>());
        }

        // Add elements to 2D Array List
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2D.get(i).add(in.nextInt());
            }
        }

        System.out.println(list2D);
    }
}
