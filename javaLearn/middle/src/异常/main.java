package 异常;

public class main
{
    public static void main(String[] args)
    {
        int i = 10;
        teach t = new teach();
        student s = new student();

        try
        {
            s.fun(i);
        }
        catch (studentException e)
        {
            e.printStackTrace();
        }
    }
}
