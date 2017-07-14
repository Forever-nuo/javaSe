package net.Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by forever on 2017-7-2.
 */
public class TcpDemo1 {
}

/***
 * 客户端
 */
class TcpClient1 {
    public static void main(String[] args) throws IOException {
        /***
         * 创建客户端socket对象
         * 建立连接
         * 参数1:服务器地址
         * 参数2:服务端口
         */
        Socket socket = new Socket("192.168.1.106", 2556);
        /***
         * 使用socket对象中的输出流创建对象
         */
        OutputStream outputStream = socket.getOutputStream();
        /**
         * 要发送的客户端数据
         */
        outputStream.write("tcp 哥们来了".getBytes());
        /**
         * 发送完了关闭
         */
        socket.close();
    }
}

class Server1 {
    public static void main(String[] args) throws IOException {
        /***
         * 建立服务端socket
         */
        ServerSocket socket = new ServerSocket(2556);
        /***
         * 接受得到客户端对象
         * 阻塞式方法
         * 返回结果 客户端socket对象
         */
        Socket clientSocket = socket.accept();
        String ip = clientSocket.getInetAddress().getHostAddress();
        System.out.println(ip + "connected......");
        /***
         * 获取网路读取流
         * 读取客户端socket对象的输出的数据
         */
        InputStream inputStream = clientSocket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1)
            System.out.println(new String(bytes, 0, len));
        clientSocket.close();//关闭客户端socket

    }
}