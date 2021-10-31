package IO;

import java.io.File;
import java.io.IOException;

public class FileDemo01
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("C:\\Users\\86157\\Desktop\\javaABC\\javaLearn\\middle\\f1.txt");
        File f2 = new File("C:\\Users\\86157\\Desktop\\javaABC\\javaLearn\\middle", "f2.txt");
        File f3 = new File("C:\\Users\\86157\\Desktop\\javaABC\\javaLearn\\middle");
        File f4 = new File(f3, "f4.txt");
        f1.createNewFile();
        String[] list = f3.list();
        for(String str:list)
        {
            System.out.println(str);
        }
        File[] files = f3.listFiles();
        for(File f:files)
        {
            System.out.println(f);
        }


    }
}
