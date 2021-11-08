package 线程;

class sellTicket implements Runnable
{
    private int res=100;
    @Override
    public void run() {
        while(true) {
            if (res > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + res + "票");
                res--;
            }
//            else
//            {
//                System.out.println("票卖完了");
//            }
        }
    }
}

public class 卖票 {
    public static void main(String[] args) {
        sellTicket s1=new sellTicket();

        Thread t1=new Thread(s1,"窗口1");
        Thread t2=new Thread(s1,"窗口2");
        Thread t3=new Thread(s1,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
