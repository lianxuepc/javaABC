package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class readFile
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream("fos.txt");

        int t=9999;
        while((t=fis.read())!=-1) System.out.println((char) t);
        fis.close();
    }
}
