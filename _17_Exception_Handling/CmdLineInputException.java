package com._17_Exception_Handling;

public class CmdLineInputException {
    public static void main(String[] args) {
        int invalid = 0;
        int number, count = 0;
        for (int i = 0; i<args.length;i++) {
            try{
                number = Integer.parseInt(args[i]);
            }
            catch (NumberFormatException e) {
                invalid = invalid + 1;
                System.out.println("Invalid number: "+args[i]);
                continue;
            }
            count = count + 1;
        }
        System.out.println("Valid Numbers = "+count);
        System.out.println("Invalid Numbers = "+invalid);
    }
}

// NOTE: This program will only run correct in command line (CMD prompt)
//       so you must create this program in separate folder where
//       then you can open cmd for windows (for others terminal)
//       then compile program using javac filename and then
//       run program using java classname passing arguments
//       Arguments passing Eg: (10 20 hello 30)
//       Here hello will be invalid argument and rest 3 will be valid
