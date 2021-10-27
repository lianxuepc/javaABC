package 接口;

public class basketballcoach extends coach implements speakEng
{
    public basketballcoach()
    {
    }

    public basketballcoach(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void teach()
    {
        System.out.println("篮球教练叫篮球");
    }

    @Override
    public void speak()
    {
        System.out.println("说英语");
    }
}
