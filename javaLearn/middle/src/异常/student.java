package 异常;

public class student
{
    public void fun(int f) throws studentException
    {
        if(f>60)
        {
            System.out.println("哈哈");
        }
        else
        {
            throw  new studentException("wuwuwu");
        }
    }
}
