package IO.BufferIo;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Created by forever on 2017-6-22.
 */
public class BufferWriterTest {


    @Test
    public void test() throws IOException {
        /***
         * 创建一个缓冲输出流对象
         * 关联某个输出流对象
         */
        BufferedWriter bufw = new BufferedWriter(new FileWriter("F:\\buffer.txt"));
        for (int i = 0; i < 10; i++) {
            bufw.write("abcde" + i);
            /***
             * 该类提供了一个
             * 写入换行符的方法
             */
            bufw.newLine();
            bufw.flush();


        }
        /***
         * 该方法的底层关闭的 就是关联的流对象
         * 调用该方法  不需要再调用 writer的close()方法
         */
        bufw.close();
    }
}
