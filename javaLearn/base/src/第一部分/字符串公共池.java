package 第一部分;

public class 字符串公共池
{
    public static void main(String[] args)
    {
        String str1="123";
        String str2="123";
        str1="12";
        System.out.println(str1);
        System.out.println(str2);
    }
}
