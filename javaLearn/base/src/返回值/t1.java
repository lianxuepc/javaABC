package 返回值;

public class t1
{
    private String name;
    private int age;

    public t1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "t1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        t1 temp=(t1) o;
        if(age!=temp.age) return false;
        return name !=null?name.equals(((t1) o).name) :temp.name==null;
    }
}
