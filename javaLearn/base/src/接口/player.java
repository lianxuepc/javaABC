package 接口;

public abstract class player extends people
{
    public player()
    {
    }

    public player(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println("运动员吃东西");
    }

    public abstract void study();
}
