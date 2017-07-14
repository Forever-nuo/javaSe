package net.UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by forever on 2017-7-2.
 */
public class ThreadChatUdp {

    public static void main(String[] args) throws SocketException {
        /**
         * 创建发送socket
         */
        DatagramSocket send = new DatagramSocket();
        DatagramSocket receive = new DatagramSocket(6555);
        new Thread(new Send(send)).start();
        new Thread(new Receive(receive)).start();
    }
}

class Send implements Runnable {
    private DatagramSocket socket;

    public Send(DatagramSocket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            while ((line = bfr.readLine()) != null) {
                if ("over".equals(line))
                    break;
                byte[] bytes = line.getBytes();
                DatagramPacket datePacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.255"), 6555);
                socket.send(datePacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}


class Receive implements Runnable {
    private DatagramSocket socket;
    public Receive(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            byte[] bytes = new byte[1024 * 64];
            DatagramPacket datePacket = new DatagramPacket(bytes, bytes.length);
            try {
                socket.receive(datePacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String hostAddress = datePacket.getAddress().getHostAddress();
            String data = new String(datePacket.getData(), 0, datePacket.getLength());
            System.out.println(hostAddress+":"+data);
        }
    }
}
