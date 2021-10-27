package 接口;

public class cat extends animal implements Jump
{
    @Override
    public void jump()
    {
        System.out.println("猫跳跳");
    }

    @Override
    public void eat()
    {
        System.out.println("猫吃鱼");
    }

}
