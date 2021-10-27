package 第一部分;
class stringAppend
{
    public String arrayToString(int[] num)
    {
        StringBuilder str=new StringBuilder();
        str.append("[");
        for(int i=0;i<num.length;i++)
        {
            str.append(num[i]);
        }
        str.append("]");

        return str.toString();
    }
}
public class test
{
    public static void main(String[] args)
    {
        int[] num={1,2,3,4};
        stringAppend sa=new stringAppend();
        System.out.println(sa.arrayToString(num));
    }
}
