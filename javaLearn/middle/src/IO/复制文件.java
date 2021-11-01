package IO;


import java.io.*;

public class 复制文件
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream  fis=new FileInputStream("middle\\src\\IO\\readFile.java");
        InputStreamReader isr=new InputStreamReader(fis);

        FileOutputStream fos=new FileOutputStream("haha.java");
        OutputStreamWriter osw=new OutputStreamWriter(fos);

        char[] cs=new char[1024];
        int t;
        while((t=isr.read(cs))!=-1)
        {
            osw.write(cs,0,t);
        }
        isr.close();
        osw.close();

    }
}
