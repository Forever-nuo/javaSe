package net.Tcp;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 图片上传多人同时上传
 * Created by forever on 2017-7-9.
 */
public class TcpDemoImgUpload2 {
}


/**
 * 上传图片到服务器
 */
class TcpClient6{
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

class TcpServer6{
    public static void main(String[] args) throws IOException {
        /***
         * 创建服务端服务器 连接客户端
         */
        ServerSocket ss  = new ServerSocket(25535);
        while(true){
            Socket s = ss.accept();

            //开启一个新的线程
            new Thread(new ImgUploadThread(s)).start();

        }
    }
}


class ImgUploadThread implements  Runnable{
    private Socket s ;

    public ImgUploadThread(Socket socket) {
        this.s = socket;
    }

    @Override
    public void run() {
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"----客户端连接");
        /****
         * 获取网络读取流 读取客户端的输出
         */
        BufferedOutputStream bos=null;
        try {
            long time = System.currentTimeMillis();
            BufferedInputStream bis   = new BufferedInputStream(s.getInputStream());
            PrintWriter pws = new PrintWriter(s.getOutputStream(),true);
             bos = new BufferedOutputStream(new FileOutputStream("H:\\testFile\\"+ip+time+".png"));
            int bt ;
            while((bt=bis.read())!=-1){
                bos.write(bt);
            }
            pws.println("上传成功");
            bos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}