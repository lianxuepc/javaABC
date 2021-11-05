package Thread;

public class main
{
    public static void main(String[] args) throws InterruptedException
    {
        MyThread1 mt1=new MyThread1("bird");
        MyThread1 mt2=new MyThread1("dog");
        MyThread1 mt3=new MyThread1("cat");

        Thread.currentThread().setName("people");


        mt1.setDaemon(true);
        mt2.setDaemon(true);
        mt3.setDaemon(true);

        mt1.start();
        mt2.start();
        mt3.start();

        for(int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName()+' '+i);
        }


    }
}
