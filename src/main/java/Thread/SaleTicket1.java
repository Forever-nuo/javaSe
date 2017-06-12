package Thread;

/**
 * 买票示例
 * 1. 总共100张票
 * 2.4个窗口同时买票
 * <p/>
 * Created by forever on 2017-6-4.
 */
public class SaleTicket1 extends Thread {
    public SaleTicket1(String name) {
        super(name);
    }

    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum > 0)
                System.out.println(this.getName() + ":正在买票" + ticketNum--);
        }
    }

    public static void main(String[] args) {
        SaleTicket1 t1 = new SaleTicket1("窗口1");
        SaleTicket1 t2 = new SaleTicket1("窗口2");
        SaleTicket1 t3 = new SaleTicket1("窗口3");
        SaleTicket1 t4 = new SaleTicket1("窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
