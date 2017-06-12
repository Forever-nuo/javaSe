package Thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource3 {
    private String name; //资源名称
    private int count; //资源计数器
    public boolean flag;
    private Lock lock = new ReentrantLock(); //创建锁
    private Condition Pro_condition = lock.newCondition(); //锁上的对象1
    private Condition cus_condition = lock.newCondition(); //锁上的对象2

    void create(String name) {
        lock.lock();  //上锁操作
        try {
            while (flag)
                try {
                    Pro_condition.await(); //wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            this.name = name + "*****" + count++;
            System.out.println(Thread.currentThread().getName() + "生成者生成:" + this.name);
            flag = flag ? false : true;
            cus_condition.signal(); //唤醒操作
        } finally {
            lock.unlock(); //解锁操作
        }

    }

    void out() {
        lock.lock();
        try {
            while (!flag)
                try {
                    cus_condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(Thread.currentThread().getName() + "消费者消费*********:" + name);
            flag = flag ? false : true;
            Pro_condition.signal();
        } finally {
            lock.unlock();
        }
    }
}


class Creator3 implements Runnable {
    private Resource3 resource3;

    public Creator3(Resource3 resource3) {
        this.resource3 = resource3;
    }

    @Override
    public void run() {
        while (true)
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
