package 第一部分;

public class stringToOthers
{
    public static void main(String[] args)
    {
//        数字字符串可以转化为相对应的数字类型,类型.parse类型（string s）
        String str="123";
        int a= Integer.parseInt(str);
        double b=Double.parseDouble(str);

        System.out.println(a);
        System.out.println(b);
    }
}
