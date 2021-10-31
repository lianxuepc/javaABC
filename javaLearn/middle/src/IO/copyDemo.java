package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyDemo
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis=new FileInputStream("fos.txt");
//        FileOutputStream fos=new FileOutputStream("f1.txt",true);
//
//        int temp;
//        while((temp=fis.read())!=-1) fos.write(temp);
//
//        fis.close();
//        fos.close();

        //读取一组
        byte[] bs=new byte[1024];
        int len1=fis.read(bs);
        int len2=fis.read(bs);
        System.out.printf("len1:%d,len2:%d",len1,len2);
    }
}
