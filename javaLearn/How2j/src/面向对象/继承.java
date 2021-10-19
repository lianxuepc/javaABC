package 面向对象;

class fatherClass
{
    String name;
    int age;

    fatherClass(String str,int n)
    {
        name=str;
        age=n;
    }
}

class sonClass extends fatherClass
{

    sonClass(String str, int n)
    {
        super(str, n);
    }
}

public class 继承
{

}
