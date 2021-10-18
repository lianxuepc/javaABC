package 第一部分;

import java.util.*;
public class 键盘输入数据
{
    public static void main(String[] args)
    {
//        所有输入默认为字符串
        Scanner reader=new Scanner(System.in);
        int a,b;
        double c;
        String str0,str1;
        a=reader.nextInt();
        b= reader.nextInt();
        c= reader.nextDouble();
        str0=reader.next();
        str1=reader.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str0);
        System.out.println(str1);
    }
}
