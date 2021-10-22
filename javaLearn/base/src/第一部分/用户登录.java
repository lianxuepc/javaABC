package 第一部分;

import java.util.Scanner;

public class 用户登录
{
    public static void main(String[] args)
    {
        String userName="lian";
        String passWord="123";
        String cinPass;
        Scanner cin=new Scanner(System.in);
        cinPass=cin.next();
        if(cinPass.equals(passWord))
        {
            System.out.println("登录成功");
        }
        else
        {
            System.out.println("密码错误");
        }

    }
}
