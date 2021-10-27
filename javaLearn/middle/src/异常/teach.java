package 异常;

public class teach
{
    public void check(int sc) throws scoreException
    {
        if(sc<0||sc>100)
        {
            throw new scoreException("成绩异常");
        }
        else
        {
            System.out.println("成绩正常");
        }
    }
}
