package net.tomcatBrowser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by forever on 2017-7-9.
 */
public class GetBrowserMessage {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(65532);

            Socket s = ss.accept();
            String ip = s.getInetAddress().getHostAddress();
            System.out.println(ip+"连接.......");

            /********获取浏览器发送的请求**********/
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);

            BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
            byte[] bytes = new byte[1024];
            int len;
            len=bis.read(bytes);
            System.out.println(new String(bytes,0,len));

            pw.println("欢迎访问服务器!");
            s.close();

    }
}
