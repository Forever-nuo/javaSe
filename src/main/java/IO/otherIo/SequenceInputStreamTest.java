package IO.otherIo;

import org.junit.Test;

import java.io.*;
import java.util.Vector;

/**
 * Created by forever on 2017-6-27.
 */
public class SequenceInputStreamTest {
    @Test
    public void testMerge() throws IOException {
        /***
         * 创建多个流
         */
        Vector<InputStream> vector = new Vector<>();
        vector.add(new FileInputStream("H:\\testFile\\1.txt"));
        vector.add(new FileInputStream("H:\\testFile\\2.txt"));

        /**
         * 将流放到序列化流中
         */
        SequenceInputStream si = new SequenceInputStream(vector.elements());
        byte[] bt = new byte[1024];
        OutputStream fr = new FileOutputStream("H:\\testFile\\3.txt");
        int len;
        while ((len = si.read(bt)) != -1) {
            fr.write(bt, 0, len);
        }
        fr.close();
        si.close();
    }


/*    @Test
    public void test1() {
        File file = new File("H:\\testFile\\3.txt");
        System.out.println( file.delete());
    }*/

    /****
     * 切割文件
     * 一个读取流
     * 多个输出流
     *
     * @throws IOException
     */
    @Test
    public void testSplit() throws IOException {
        InputStream in = new FileInputStream("H:\\testFile\\view.jpg");
        /**
         * 输出不能创建太大,内存溢出
         */
        byte[] bt = new byte[1024 * 50];
        int count = 0;
        int len;
        OutputStream os;
        while ((len = in.read(bt)) != -1) {
            os = new FileOutputStream(new File("H:\\testFile\\view" + (count++)) + ".part");
            os.write(bt, 0, len);
            os.close();
        }
        in.close();
    }
}
