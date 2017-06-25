package IO.BufferIo;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Created by forever on 2017-6-24.
 */
public class LineNumberReaderTest {

    /***
     *特有方法 读取的时候可以获取到行号
     * @throws IOException
     */
    @Test
    public void testReadLine() throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("F:\\buffer.txt"));
        String line;
        while ((line=lnr.readLine())!=null) {
            System.out.println(line);
            System.out.println(lnr.getLineNumber());
        }
        lnr.close();
    }

    /**
     * 设置起始行号
     * @throws IOException
     */
    @Test
    public void testReadLIne() throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("F:\\buffer.txt"));
        String line;
        lnr.setLineNumber(4); //
        while ((line=lnr.readLine())!=null) {
            System.out.println(line);
            System.out.println(lnr.getLineNumber());
        }
        lnr.close();
    }
}
