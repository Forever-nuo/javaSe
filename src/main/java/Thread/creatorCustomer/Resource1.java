package Thread.creatorCustomer;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * 资源对象
 * Created by forever on 2017-6-5.
 */
public class Resource1 {
    private String name; //资源名称
    private int count; //资源计数器
    public boolean flag;

    synchronized void create(String name) {
        if (flag)
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
        if (!flag)
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


class Creator1 implements Runnable {
    private Resource1 resource1;

    public Creator1(Resource1 resource1) {
        this.resource1 = resource1;
    }

    @Override
    public void run() {
        while(true)
        resource1.create("商品");
    }
}

class Customer1 implements Runnable {
    private Resource1 resource1;

    public Customer1(Resource1 resource1) {
        this.resource1 = resource1;
    }

    @Override
    public void run() {
        while (true)
            resource1.out();
    }
}

class Demo1 {
    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();
        new Thread(new Creator1(resource1)).start();
         new Thread(new Creator1(resource1)).start();
        new Thread(new Customer1(resource1)).start();
        new Thread(new Customer1(resource1)).start();
    }
}