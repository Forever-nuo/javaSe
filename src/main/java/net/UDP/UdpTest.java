package net.UDP;

import java.io.IOException;
import java.net.*;

/**
 * Created by forever on 2017-7-2.
 */
public class UdpTest {
    /***
     * socket发送端
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        /***
         *创建对应的发送端socket服务
         * 可以指定端口号如果不指定 系统就随机分配端口
         */
        DatagramSocket socket = new DatagramSocket(8888);
        /***
         * 创建数据包 封装数据,目标地址
         */
        byte[] buf = "udp send message".getBytes();
        InetAddress address = InetAddress.getByName("192.168.1.106");
        /***
         * 构造函数说明
         * 构造函数可以创建,发送socket对象 也可以创建接受socket对象
         */
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 1028);
        /***
         * 发送数据
         */
        socket.send(packet);
    }
}

class UdpGet {
    /***
     * socket接受端
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        /***
         *创建对应的发送socket服务
         * 一般发送端的socket 的构造函数要明确接受哪个端口的数据
         */
        DatagramSocket socket = new DatagramSocket(1028);
        /**
         * 数据包用来封装接受到的数据
         */
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        /**
         * 使用receive方法接受数据
         * 参数一个数据包
         */
        socket.receive(packet);
        /***
         * 使用数据包的对象的方法 解析数据
         */
        System.out.println( new String(packet.getData(),0,packet.getLength())+"对方端口号:"+packet.getPort());

    }
}

