package 接口;

public abstract class coach extends people
{
    public coach()
    {
    }

    public coach(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println("教练吃东西");
    }

    public abstract void teach();
}
