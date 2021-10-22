package 第一部分;

public class StringBuilder类
{
    public static void main(String[] args)
    {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2= new StringBuilder("123");

        // append()方法，返回对象
        s1.append("123");

        System.out.println(s1);
        System.out.println(s2);

        //equals比较地址
        System.out.println(s1.equals(s2));

        //反转字符串
        s1.reverse();
        System.out.println(s1);

//        转化为string
        String s3=s1.toString();
        System.out.println(s3);


    }
}
