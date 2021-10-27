package 异常;

public class main
{
    public static void main(String[] args)
    {
        int i=10;
        teach t=new teach();
        try
        {
            t.check(i);
        }
        catch (scoreException e)
        {
            e.printStackTrace();
        }
    }
}
