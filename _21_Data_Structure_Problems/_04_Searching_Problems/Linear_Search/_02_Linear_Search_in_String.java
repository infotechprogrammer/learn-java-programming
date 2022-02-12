import java.util.Arrays;

public class _02_Linear_Search_in_String {
    public static void main(String[] args) {
        String name = "Sahil";
        char target = 'h';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));
        System.out.println(search1(name,target));
        System.out.println(search2(name,target));
    }

    //Using for each loop
    static boolean search2(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for (char ch: str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }

    //Using for loop
    static boolean search1(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static int search(String str, char target) {
        if(str.length() == 0) {
            return -1; // Means not found
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
