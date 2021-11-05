package 可变参数;

public class kbcs1
{
    public static int sums(int... a)
    {
        int t=0;
        for(int i:a)
        {
            t+=i;
        }
        return t;
    }

    public static void main(String[] args)
    {
        int[] is={1,2,3,4,5};
        System.out.println(sums(1,2,3,4));
    }



}
