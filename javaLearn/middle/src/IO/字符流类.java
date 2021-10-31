package IO;

import sun.nio.ch.IOStatus;

import java.io.*;

public class 字符流类
{
    public static void main(String[] args) throws IOException
    {
        String str="中国阿斯蒂芬户籍卡洛杉矶的风口浪尖阿三ask好的饭卡上打开放假啦空手道发来看哈是啊圣诞快乐发哈开始大幅看了哈士大夫看见哈萨克冷静点回复绿卡合适的理发师的付款哈军事对抗疗法黑暗势力客户机地方";
        char[] chars=new char[24];


        FileOutputStream fos=new FileOutputStream("f1.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
        osw.write(str);
        osw.close();
        FileInputStream fis=new FileInputStream("f1.txt");
        InputStreamReader isr=new InputStreamReader(fis,"UTF-8");

        int t;//返回读取字符长度
        while((t=isr.read(chars))!=-1)
        {
            //把字符数组转化成字符串
            System.out.println(new String(chars,0,t));
        }
        isr.close();

    }
}
