package net.URIURL;


import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by forever on 2017-7-9.
 */
public class URLDemo {
    /**
     * 常用方法演示
     */
    @Test
    public void test1() throws MalformedURLException {

        URL url  = new URL("http://192.168.1.106:8080/web/test.html?name=zhangsan&age=15");
        System.out.println(url.getProtocol()); //http
        System.out.println(url.getHost());//192.168.1.106
        /***
         * 如果没有端口
         * 会返回-1
         * 默认端口80
         */
        System.out.println(url.getPort());//8080
        /**
         * 路径
         */
        System.out.println(url.getPath());///web/test.html
        /**
         * 路径加query参数
         */
        System.out.println(url.getFile());///web/test.html?name=zhangsan&age=15
        /**
         * query参数
         */
        System.out.println(url.getQuery());//name=zhangsan&age=15
    }


    /***
     * 获取远程连接对象
     * @throws IOException
     */
    @Test
    public void testOpenConnection() throws IOException {
        URL url  = new URL("http://www.baidu.com");
        /***
         * 获取远程连接对象
         */
        URLConnection urlCon = url.openConnection();
        System.out.println(urlCon);

        /***
         * socket是应用层的协议
         * http协议 是应用层的协议
         */
        InputStream inputStream = urlCon.getInputStream();
        /***
         * 获取服务器返回的数据
         * 没有响应求
         */
        byte[] bytes= new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

    }
}
