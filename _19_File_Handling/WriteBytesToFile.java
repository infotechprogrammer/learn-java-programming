import java.io.*;
public class WriteBytesToFile {
    public static void main(String[] args) {
        byte cities[] = {'D','E','L','H','I','\n','J','A','L','A','N','D','H','A','R','\n','L','O','N','D','O','N','\n'};
        FileOutputStream outfile = null;
        try {
            outfile = new FileOutputStream("city.txt");
            outfile.write(cities);
            outfile.close();
        }
        catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }
    }
}
