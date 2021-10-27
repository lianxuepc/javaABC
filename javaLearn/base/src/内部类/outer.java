package 内部类;

public class outer
{
    private String name;
    private int age;

    public outer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    private class inner
    {
        public void show()
        {
            System.out.println(age);
        }
    }

    public void method()
    {
        inner i=new inner();
        i.show();
    }

    @Override
    public String toString()
    {
        return "outer{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }
}
