package CollectionAndMap.Map;

import org.junit.Test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Created by forever on 2017-6-24.
 */
public class PropertiesTest {


    /***
     * list方法 直接打印
     * 所有的键值对
     */
    @Test
    public void testList() {
        System.getProperties().list(System.out);
    }

    @Test
    public void testSetAndGet() {
        Properties properties = new Properties();
        /****
         * 设置值
         */
        properties.setProperty("张三", "39");
        properties.setProperty("王五", "45");

        /***
         * 覆盖值 重新设置值
         */
        properties.setProperty("王五", "50");
        /**
         * 获取值
         * 通过key获取值
         */
        System.out.println(properties.getProperty("张三"));
    }


    /***
     * 获取key 的set集合
     */
    @Test
    public void testStringPropertyNames() {
        Properties properties = new Properties();
        properties.setProperty("张三", "39");
        properties.setProperty("王五", "45");
        /***
         * 遍历所有值
         */
        for (String name : properties.stringPropertyNames()) {
            System.out.println(name + "===" + properties.getProperty(name));
        }
    }


    /***
     * 原理:
     * 读取配置文件
     * 放到properties中
     */
    @Test
    public void testGetFileProperties() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("H:\\init.txt"));
        String line;
        Properties properties = new Properties();
        while((line=br.readLine())!=null){
            String[] split = line.split("=");
            properties.setProperty(split[0],split[1]);
        }
        for (String name : properties.stringPropertyNames()) {
            System.out.println(name+"===="+properties.get(name));
        }
    }

    @Test
    public void testLoad() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("H:\\init.txt"));
        for (String name : properties.stringPropertyNames()) {
            System.out.println(name+"===="+properties.get(name));
        }
        System.out.println(properties.getProperty("张三"));
    }

    /***
     * 将内存中的键值对保存到配置文件中
     * @throws IOException
     */
    @Test
    public void testStore() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("H:\\init.txt"));
        properties.setProperty("张三", "99");
        properties.store(new FileWriter("H:\\init.txt"),"修改备注");
    }




}
