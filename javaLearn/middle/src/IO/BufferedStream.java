package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedStream
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis=new FileInputStream("fos.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        FileOutputStream fos=new FileOutputStream("fos.txt");
        BufferedOutputStream bos =new BufferedOutputStream(fos);

        bos.write("hello".getBytes(StandardCharsets.UTF_8));
        bos.write("\r\nworld".getBytes(StandardCharsets.UTF_8));
        bos.close();
        byte[] b=new byte[1024];
        int len;
        while((len=fis.read(b))!=-1)
        {
            fos.write(b);
        }


    }
}
