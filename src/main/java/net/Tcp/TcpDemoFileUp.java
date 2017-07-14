package net.Tcp;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器文件上传
 * Created by forever on 2017-7-3.
 */
public class TcpDemoFileUp {

}

/**
 * 客户端
 */
class TcpClient4{
    /**
     * 将客户端的本地的文件上传到服务端
     * @param args
     */
    public static void main(String[] args) throws IOException {
        /**
         * 创建客户端对象 , 明确服务端地址和服务应用的端口号
         */
        Socket socket = new Socket("192.168.1.106",25535);
        /***
         * 读取一个本地文件
         */
        BufferedReader br = new BufferedReader(new FileReader("H:\\testFile\\上传服务器文件.txt"));
        /***
         * 网络输出流 输出到服务端
         */
        PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }
        socket.shutdownOutput(); //关闭网络输出流 相当于给流中加了一个结束标志-1;

        /**
         * 网络读取流 读取 服务端返回的上传成功结果
         */
        BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br2.readLine());
        socket.close();
        br.close();
    }
}

/***
 * 文件上传服务端
 */
 class TcpServer4{
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
        PrintWriter pw = new PrintWriter(new FileWriter("H:\\testFile\\2.txt"),true);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pws = new PrintWriter(s.getOutputStream(),true);
        String line ;
        while((line=br.readLine())!=null){ //读取的是网络流 要有结束标记 可以自定义结束标记
            pw.println(line);
        }
        pws.println("上传成功");
        pw.close();
        s.close();
        ss.close();
    }
}