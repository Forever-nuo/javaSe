package net.UDP;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by forever on 2017-7-2.
 * 发送方
 */
public class UdpKeyTest {
    public static void main(String[] args) throws IOException {
        /***
         * 创建socket发送对象
         */
        DatagramSocket socket = new DatagramSocket();
        /**
         * 创建数据包封装发送的数据
         */
        BufferedReader bfs = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bfs.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            byte[] bytes = line.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.106"), 20006);
            socket.send(packet);
        }
        socket.close();
    }
}


class GetKey {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(20006);

        while (true) {
            byte[] bytes = new byte[1024*64];
            DatagramPacket packet = new DatagramPacket(bytes, 1024);
            socket.receive(packet);
            System.out.println(new String(packet.getData(),0,packet.getLength()));
        }
    }
}