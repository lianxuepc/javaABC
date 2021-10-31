package IO;

import java.io.*;

public class FileWriteStreamDemo01
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos=null;
        try
        {
            fos=new FileOutputStream("f1.txt");
            fos.write(97);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(fos!=null)
            {
                fos.close();
            }
        }
    }
}
