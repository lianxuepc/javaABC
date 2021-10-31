package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo1
{
    public static void main(String[] args) throws IOException
    {
        String str="hahahhaha";
        byte[] bts=str.getBytes(StandardCharsets.UTF_8);
        byte[] b={97,98,99,100};
        //创建文件输出流对象指向文件
//        FileOutputStream fos = new FileOutputStream("fos.txt");
//        fos.write(b);
//        fos.write(bts);
//        fos.write(bts,2,2);
//        fos.close();
        FileOutputStream fosappend =new FileOutputStream("fos.txt",true);
        fosappend.write(b);
        fosappend.write(b);
        fosappend.close();

    }
}
