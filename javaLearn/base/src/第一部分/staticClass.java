package 第一部分;

class testStatic
{
    private String name;
    private int age;
    public static String address = "123";

    public testStatic(){};
    public testStatic(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void show()
    {
        System.out.println(this.age+this.name+address);
    }
}

public class staticClass
{
    public static void main(String[] args)
    {
        testStatic ts1 = new testStatic("lian",12);
        testStatic.address="hah";
        ts1.show();
    }

}
