import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr=new FileReader("fos.txt");
        FileWriter fw=new FileWriter("fos.txt");

        fw.write("asdfasfdasdf");
        fw.close();
        System.out.println((char)fr.read());


        fr.close();
    }
}