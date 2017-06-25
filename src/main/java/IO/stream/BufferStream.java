package IO.stream;

import org.junit.Test;

import java.io.*;
import java.util.TreeSet;

/**
 * Created by forever on 2017-6-24.
 */
public class BufferStream {

    /***
     * 缓冲流
     * 不要定义数组缓冲区
     * 缓冲流中内部有数组
     * @throws IOException
     */
    @Test
    public void testCopyUseBuffer() throws IOException {
        MyBufferedInputStream bis = new MyBufferedInputStream(new FileInputStream("H:\\settings.jar"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("H:\\copy2.jar"));
        int by ;
        while((by=bis.myRead())!=-1){
            bos.write(by);
        }

        bos.close();
    }
}
