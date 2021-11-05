package 泛型;

import java.util.ArrayList;
import java.util.Iterator;

class ft1
{
    public<T> void fun(T t)
    {
        System.out.println(t);
    }
}

public class f1
{
    public static void main(String[] args)
    {
//        Generic<String> g1=new Generic();
//        g1.setT("asdfasdf");
//        System.out.println(g1.getT());
//
//        Generic<Integer> g2=new Generic<>();
//        g2.setT(12);
//        System.out.println(g2.getT());

        ft1 ft1=new ft1();
        ft1.fun("asd");
        ft1.fun(1);
        ft1.fun(true);

    }
}
