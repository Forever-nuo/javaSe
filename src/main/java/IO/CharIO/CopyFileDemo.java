package IO.CharIO;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by forever on 2017-6-21.
 */
public class CopyFileDemo {


    /**
     * 复制的原理
     * 1.读取源文件
     * 2.读取的数据 写入到 另外一个文件中
     *
     * @param args
     */
    public static void main(String[] args) {


    }

    /***
     *该种方式 使用字符缓冲区
     *建议使用
     */
    @Test
    public void testCopy2() {
        FileWriter fw = null; FileReader fr = null;
        try {
            fw = new FileWriter("H:\\copy.txt");
            fr = new FileReader("H:\\abc.txt");
            char[] bf = new char[1024];
            int num;
            while ((num = fr.read(bf)) != -1)
                fw.write(bf, 0, num);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    /***
     * 一个一个字符的复制
     * 不建议使用该方式
     */
    @Test
    public void testCopy1() throws IOException {
        FileWriter fw = new FileWriter("H:\\java.txt");
        FileReader fr = new FileReader("H:\\abc.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
