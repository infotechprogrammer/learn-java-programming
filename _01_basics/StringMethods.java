public class StringMethods {
    public static void main (String[] args) {
        String greeting = "Hello";
        System.out.println(greeting+" Sahil");

        //Function to get string length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //String to UPPERCASE
        String words = "Hello World";
        System.out.println(words.toUpperCase());
        //String to lowercase
        System.out.println(words.toLowerCase());

        //Finding a Character in a String
        String text = "Please locate where 'sb' occurs";
        System.out.println("sb is at "+text.indexOf("sb")+"th location");

        //String Concatenation +
        String firstName = "Sahil";
        String lastName = "Batra";
        System.out.println("My name is "+firstName+" "+lastName);

        //String Concatenation using concat() method
        System.out.println(firstName.concat(lastName)+" is my name.");

        //Special Characters
        /*
        Escape character	Result	Description
        \'	                '	    Single quote
        \"	                "       Double quote
        \\	                \	    Backslash
         */
        String desc = "We are the so-called \"Punjabi\" from the north.";
        System.out.println(desc);
        String text1 = "It\'s alright";
        System.out.println("Dont worry "+text1);

        //Six other escape sequences are valid in Java:
        /*
        Code	Result
        \n 	    New Line
        \r	    Carriage Return
        \t	    Tab
        \b	    Backspace
        \f	    Form Feed
        Try above yourself
         */

        //WARNING!
        //Java uses the + operator for both addition and concatenation.
        //Numbers are added. Strings are concatenated.
    }
}
