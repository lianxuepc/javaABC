package 第一部分;

public class test
{
    public static void main(String[] args)
    {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2 = new StringBuilder("123");
        sb1.append("123");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
