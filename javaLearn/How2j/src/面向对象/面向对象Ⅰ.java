package 面向对象;

public class 面向对象Ⅰ
{
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public static void main(String[] args)
    {
        面向对象Ⅰ garen = new 面向对象Ⅰ();
        garen.name="盖伦";
        garen.hp=600;
        garen.armor=30;
        garen.moveSpeed=500;

        System.out.println(garen.name);
    }

    int getMoveSpeed()
    {
        return moveSpeed;
    }
}
