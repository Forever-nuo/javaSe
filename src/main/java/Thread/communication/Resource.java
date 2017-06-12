package Thread.communication;


/**
 * Created by forever on 2017-6-4.
 */
public class Resource {
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
class inputThread implements Runnable {
    private Resource resource;
    private boolean flag;

    public inputThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            if (flag) {
                resource.setName("张三");
                resource.setSex("男");
            } else {
                resource.setName("kate");
                resource.setSex("女");
            }
            flag = flag ? false : true;
        }
    }
}

class outPutThread implements Runnable {
    private Resource resource;

    public outPutThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true)
            System.out.println("姓名:" + resource.getName() + "性别:" + resource.getSex());
    }
}


class demo {
    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(new inputThread(resource)).start();
        new Thread(new outPutThread(resource)).start();
    }
}