package Thread.creatorCustomer;

/**
 * Created by forever on 2017-6-5.
 */
public class Resource2 {
    private String name; //资源名称
    private int count; //资源计数器
    public boolean flag;

    synchronized void create(String name) {
        while (flag)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.name = name + "*****" + count++;
        System.out.println(Thread.currentThread().getName() + "生成者生成:" + this.name);
        flag = flag ? false : true;
        notify();
    }

    synchronized void out() {
        while (!flag)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName() + "消费者消费*********:" + name);
        flag = flag ? false : true;
        notify();
    }
}


class Creator2 implements Runnable {
    private Resource2 resource2;

    public Creator2(Resource2 resource2) {
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while(true)
            resource2.create("商品");
    }
}

class Customer2 implements Runnable {
    private Resource2 resource2;

    public Customer2(Resource2 resource2) {
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        while (true)
            resource2.out();
    }
}

class Demo2 {
    public static void main(String[] args) {
        Resource2 resource2 = new Resource2();
        new Thread(new Creator2(resource2)).start();
        new Thread(new Creator2(resource2)).start();
        new Thread(new Customer2(resource2)).start();
        new Thread(new Customer2(resource2)).start();
    }
}
