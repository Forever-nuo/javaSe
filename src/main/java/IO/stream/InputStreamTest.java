package IO.stream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.TreeSet;

/**
 * Created by forever on 2017-6-24.
 */
public class InputStreamTest {

    /***
     * 字节流的 一个个的读取
     *
     * @throws IOException
     */
    @Test
    public void testReadOne() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\java.txt");
        int bt;
        while ((bt = fis.read()) != -1) {
            System.out.print((char) bt);
        }
    }

    /**
     * 放在数组 缓冲区里
     *
     * @throws IOException
     */
    @Test
    public void testRead() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\java.txt");
        byte[] bt = new byte[1024];
        int num;
        while ((num = fis.read(bt)) != -1) {
            System.out.println(new String(bt));
        }
        fis.close();
    }

    /***
     * 创建一个指定文件大小的 字节数组缓冲区
     * 不需要循环了
     */
    @Test
    public void testAvailable() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\java.txt");
        byte[] bt = new byte[fis.available()];
        System.out.println(new String(bt));
        fis.close();
    }

}
