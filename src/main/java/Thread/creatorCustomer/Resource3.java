package Thread.creatorCustomer;

/**
 * Created by forever on 3017-6-5.
 */
public class Resource3 {
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
        notifyAll();
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
        notifyAll();
    }
}


class Creator3 implements Runnable {
    private Resource3 resource3;

    public Creator3(Resource3 resource3) {
        this.resource3 = resource3;
    }

    @Override
    public void run() {
        while(true)
            resource3.create("商品");
    }
}

class Customer3 implements Runnable {
    private Resource3 resource3;

    public Customer3(Resource3 resource3) {
        this.resource3 = resource3;
    }

    @Override
    public void run() {
        while (true)
            resource3.out();
    }
}

class Demo3 {
    public static void main(String[] args) {
        Resource3 resource3 = new Resource3();
        new Thread(new Creator3(resource3)).start();
        new Thread(new Creator3(resource3)).start();
        new Thread(new Customer3(resource3)).start();
        new Thread(new Customer3(resource3)).start();
    }
}
