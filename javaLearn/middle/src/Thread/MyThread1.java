package Thread;

public class MyThread1 extends Thread
{
    private String name;

    public MyThread1(){};
    public MyThread1(String name){super(name);}

    @Override
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            System.out.println(getName()+" "+i);
        }

    }
}
