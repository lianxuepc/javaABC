package 第一部分;

public class 字符串构造
{
    public static void main(String[] args)
    {
        String s1=new String();
        char[] chs={'a','b','c'};
        String s2=new String(chs);
        byte[] bytes={97,98,99};
        String s3=new String(bytes);
        String s4="abc";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
