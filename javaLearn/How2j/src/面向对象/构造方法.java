package 面向对象;

class make
{
    String name;
    int age;

    make()
    {
//        this(" ",0);
        System.out.println("调用父类无参构造");
    }

    make(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("调用父类有参构造");
    }

    public void hello()
    {
        System.out.printf("i am %s , %d years\n",this.name,this.age);
    }
}

class makeSon extends make
{
    double height;

    makeSon()
    {
        System.out.println("调用子类无参构造");
    }

    makeSon(String name,int age,double height)
    {
        super(name,age);
        this.height=height;
        System.out.println("调用子类有参构造");
    }

    public void say()
    {
        System.out.printf("我是%s,%d岁了,%fcm高\n",this.name,this.age,this.height);
    }

    public void hello()
    {
        System.out.println("子类新的覆盖父类的方法");
    }
}

public class 构造方法
{
    public static void main(String[] args)
    {
        makeSon test1 = new makeSon("hah",12,180);
        test1.hello();
        test1.say();

    }

}
