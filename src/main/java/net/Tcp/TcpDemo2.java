package net.Tcp;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import sun.reflect.generics.tree.ByteSignature;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Tcp 客户端和服务端之间的互信
 * Created by forever on 2017-7-2.
 */
public class TcpDemo2 {


}


class TcpClient2 {

    public static void main(String[] args) throws IOException {
        /**
         * 创建socket对象
         */
        Socket socket = new Socket("192.168.1.106",20007);

        OutputStream out =  socket.getOutputStream();
        out.write("服务端哥们你好,我是客户端".getBytes());

        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while((len=in.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        socket.close();
    }
}





class TcpServer2 {

    public static void main(String[] args) throws IOException {
        /**
         * 创建socket对象
         */
        ServerSocket serverSocket = new ServerSocket(20007);
        /***
         * 接受客户端Socket对象
         */
        Socket socket = serverSocket.accept();
        System.out.println("客户端连接了");
        /***
         *获取socket中的读取流对象
         * 获得客户端发送的数据
         */
        InputStream in = socket.getInputStream();
        byte[] bytes= new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes,0,len));
        /***
         * 获取socket中的输出流对象
         * 给客户端返回数据
         */
        OutputStream out =  socket.getOutputStream();
        out.write("客户端哥们你好,我收到了你的数据".getBytes());
        socket.close();
    }
}
