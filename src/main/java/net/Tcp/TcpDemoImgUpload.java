package net.Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by forever on 2017-7-7.
 */
public class TcpDemoImgUpload {
}


/**
 * 上传图片到服务器
 */
class TcpClient5{
    public static void main(String[] args) throws IOException {
        //创建客户端socket
        Socket socket = new Socket("192.168.1.106",25535);

        //获得socket输出流
        OutputStream outputStream =    socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        int len;
        //选择一个本地图片
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("H:\\testFile\\2.png"));
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        socket.shutdownOutput();
        socket.close();
    }

}

class TcpServer5{
    public static void main(String[] args) throws IOException {
        /***
         * 创建服务端服务器 连接客户端
         */
        ServerSocket ss  = new ServerSocket(25535);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"----客户端连接");
        /****
         * 获取网络读取流 读取客户端的输出
         */
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
        PrintWriter pws = new PrintWriter(s.getOutputStream(),true);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("H:\\testFile\\2(副本).png"));
        int bt ;
        while((bt=bis.read())!=-1){
            bos.write(bt);
        }
        pws.println("上传成功");
        bos.close();
        ss.close();
        s.close();
    }
}


