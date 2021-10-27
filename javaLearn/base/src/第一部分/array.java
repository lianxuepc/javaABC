package 第一部分;

import java.util.ArrayList;

public class array<S>
{
    public static void main(String[] args)
    {
        ArrayList<String> arr=new ArrayList<>();
        System.out.println(arr.add("123"));
        System.out.println(arr.add("123"));
        System.out.println(arr.add("123"));
        System.out.println(arr.add("123"));
        arr.add(1,"we");
        arr.remove(2);
        arr.set(0,"hah");
        System.out.println(arr.get(3));
        System.out.println(arr);


    }


}
