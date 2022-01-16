package com._19_File_Handling;

import java.io.*;
public class ReadBytesFromFile {
    public static void main(String[] args) {
        FileInputStream infile;
        int b;
        try {
            infile = new FileInputStream("city.txt");
            while ((b=infile.read()) != -1) {
                System.out.println((char)b);
            }
            infile.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
