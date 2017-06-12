package Thread.communication;

/**
 * Created by forever on 2027-6-4.
 */
public class Resource2 {
    private String name;
    private String sex;
    public boolean flag = false;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

/**
 * 输入线程类
 */
class inputThread2 implements Runnable {
    private Resource2 resource;
    private boolean flag;

    public inputThread2(Resource2 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (resource) {
                if (resource.flag) {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (flag) {
                    resource.setName("张三");
                    resource.setSex("男");
                } else {
                    resource.setName("kate");
                    resource.setSex("女");
                }
                flag = flag ? false : true;
                resource.flag=true;
                resource.notify();
            }
        }
    }
}

class outPutThread2 implements Runnable {
    private Resource2 resource;

    public outPutThread2(Resource2 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {

            synchronized (resource) {
                if (!resource.flag) {

                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("姓名:" + resource.getName() + "性别:" + resource.getSex());
                resource.flag=false;
                resource.notify();
            }
        }

    }
}


class demo2 {
    public static void main(String[] args) {
        Resource2 resource = new Resource2();
        new Thread(new inputThread2(resource)).start();

        new Thread(new outPutThread2(resource)).start();

    }
}
