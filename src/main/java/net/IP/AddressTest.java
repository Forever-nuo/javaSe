package net.IP;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by forever on 2017-6-30.
 */
public class AddressTest {
    @Test
    public void testGetLocalHost() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address );//结果主机名和ip地址
        /**
         * 分别获取
         * 获取主机名 获取主机ip地址
         */
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());

    }


    @Test
    public void testGetByName() throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.baidu.con");
        System.out.println(address);
    }


    /**
     * 多个ip地址 对应同一个主机名
     * 百度的
     * @throws UnknownHostException
     */
    @Test
    public void test() throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName("www.baidu.com");
    }
}
