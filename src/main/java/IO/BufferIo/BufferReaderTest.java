package IO.BufferIo;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by forever on 2017-6-22.
 */
public class BufferReaderTest {

    @Test
    public void test() throws IOException {
        /****
         * 创建一个缓冲读取流 对象
         * 和某个 读取流 相关联
         */
        BufferedReader bufr = new BufferedReader(new FileReader("F:\\buffer.txt"));

        /***
         * 判断读取完的条件
         * 字符串返回空
         */
        String line ;
        /***
         * 特有方法 一行一行的读取
         */
        while((line=bufr.readLine())!=null){
            System.out.println(line);
        }

    }


    @Test
    public void testReadLine() {

    }
}
