
//class t
//{
//    int fun(char[] cs)
//    {
//        int i=0;
//        for(char c:cs)
//        {
//
//        }
//    }
//}

public class test
{
    public static void main(String[] args)
    {
        int i=0;
        char[] cs=new char[1024];

        for(char c:cs)
        {
            if(c=='\0') i++;
        }
        System.out.println(i);
    }
}
