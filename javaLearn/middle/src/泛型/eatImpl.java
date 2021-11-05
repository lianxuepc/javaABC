package 泛型;

public class eatImpl<T> implements eat<T>
{

    @Override
    public void eatThing(T t)
    {
        System.out.println(t);
    }
}
