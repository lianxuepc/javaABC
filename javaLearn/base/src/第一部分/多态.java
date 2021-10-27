package 第一部分;

class animal
{
    public String name;
    public int age;

    public animal(){}
    public animal(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void eat()
    {
        System.out.println("动物吃东西");
    }
}

class cat extends animal
{
    public int weight;
    public int age;



    public cat(){};
    public cat(int weight, int age)
    {
        this.weight = weight;
        this.age = age;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public int getAge()
    {
        return age;
    }

    @Override
    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public void eat()
    {
        System.out.println("毛吃鱼");
    }
}

class dog extends animal
{
    public int weight=100;
    public int age=18;
    @Override
    public void eat()
    {
        System.out.println("狗吃屎");
    }
}

class useAnimal
{
    public void animalEat(animal c)
    {
        c.eat();
    }
}

public class 多态
{
    public static void main(String[] args)
    {
//        dog d=new dog();
//        cat c=new cat();
//
//        useAnimal ua=new useAnimal();
//        ua.animalEat(d);
//        ua.animalEat(c);
        animal a=new cat();
        cat c=(cat)a;
        a.eat();

        System.out.println(a.name);
    }
}
