package net.Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.SocketHandler;

/**
 * 需求分析  建立一个文本转换服务器
 * 客户端给服务端发送文本,服务端会将文本转成大写再返回给客户端
 * Created by forever on 2017-7-3.
 */
public class TcpDemo3 {

}

class TcpClient3 {
    public static void main(String[] args) throws IOException {
        /**
         * 创建客户端socket对象
         */
        Socket socket = new Socket("192.168.1.106", 25535);
        /***
         * 获取socket输出流对象
         * 使用输出流对象输出数据
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("over".equals(line))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
            String line2 = br2.readLine();
            System.out.println(line2);
        }
    }
}

class TcpServer3 {
    public static void main(String[] args) throws IOException {
        /**
         * 创建服务端socket对象
         */
        ServerSocket serverSocket = new ServerSocket(25535);
        /***
         * 连接客户端 获取到客户端socket
         */
        Socket clientSocket = serverSocket.accept();
        System.out.println(clientSocket.getInetAddress().getHostAddress() + "......连接");
        String line;
        InputStream is = clientSocket.getInputStream();
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) { //readLine 方法是读取换行标志 读到后省略换行标志
            bw.write(line.toUpperCase());   //write 方法要进行刷新
            bw.newLine();
            bw.flush();
        }
    }

}