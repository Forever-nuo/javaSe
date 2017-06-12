package Thread.communication;


/**
 * Created by forever on 2017-6-4.
 */
public class Resource1 {
    private String name;
    private String sex;

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
class inputThread1 implements Runnable {
    private Resource1 resource;
    private boolean flag;

    public inputThread1(Resource1 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource) {
                if (flag) {
                    resource.setName("张三");
                    resource.setSex("男");
                } else {
                    resource.setName("kate");
                    resource.setSex("女");
                }
            }
            flag = flag ? false : true;
        }
    }
}

class outPutThread1 implements Runnable {
    private Resource1 resource;

    public outPutThread1(Resource1 resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (resource){
                System.out.println("姓名:" + resource.getName() + "性别:" + resource.getSex());
            }
        }

    }
}


class demo1 {
    public static void main(String[] args) {
        Resource1 resource = new Resource1();
        new Thread(new inputThread1(resource)).start();
        new Thread(new outPutThread1(resource)).start();
    }
}
