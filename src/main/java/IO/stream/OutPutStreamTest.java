package IO.stream;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by forever on 2017-6-24.
 */
public class OutPutStreamTest {


    /****
     * 字节流的 写操作
     * 操作字节  不需要刷新
     * @throws IOException
     */
    @Test
    public void testWrite() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\outStream.txt");
        fos.write("abcef".getBytes());
        fos.close();
    }
}
