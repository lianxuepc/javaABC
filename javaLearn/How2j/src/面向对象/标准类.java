package 面向对象;

class standClass
{
    private String name;
    private int age;
    private double height;

    public standClass(){};

    public standClass(String name,int age,double height)
    {
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public double getHeight()
    {
        return this.height;
    }

    public void show()
    {
        System.out.println(this.name+" "+this.age+" "+this.height);
    }
}

public class 标准类
{
    public static void main(String[] args)
    {
        standClass s1=new standClass();
        standClass s2=new standClass("lian",18,180);
        s1.show();
        s2.show();
    }

}
