import java.io.*;
public class CopyCharactersInFile {
    public static void main(String[] args) {
        File inFile = new File("input.bat");
        File outFile = new File("output.bat");
        FileReader ins  = null;
        FileWriter outs = null;
        try
        {
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);
            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }
        }
        catch(IOException e) {
            System.out.println(e);
            System.exit(-1);
        }
        finally {
            try {
                ins.close();
                outs.close();
            }
            catch (IOException e) {
            }
        }
    }
}
