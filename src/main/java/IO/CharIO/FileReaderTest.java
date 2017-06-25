package IO.CharIO;

import org.junit.Test;

import javax.annotation.processing.Filer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/**
 * Created by forever on 2017-6-21.
 */
public class FileReaderTest {
    /***
     * fileReader构造方法
     */
    @Test
    public void testConstructed() throws FileNotFoundException {

        /***
         * 创建文件读取流对象
         * 并且 和 要读取的源文件关联
         * 并且 和 要读取的源文件关联
         */
        FileReader fr = new FileReader("F:\\java.txt");

    }

    /***
     * close方法
     * 资源关闭后
     * 不能再进行read操作
     * close()不会刷新  不同于 fileWriter方法的close () 会刷新
     * @throws IOException
     */
    @Test
    public void testClose() throws IOException {
        FileReader fr = new FileReader("F:\\java.txt");
        fr.close();
        fr.read();
    }

    /***
     * read()方法
     * 一个一个字符的读取
     * 如果返回-1表示读取完
     * @throws IOException
     */
    @Test
    public void testRead1() throws IOException {
        FileReader fr = new FileReader("F:\\java.txt");
        int ch ;
        while( (ch= fr.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();
    }


    /***
     * read (char[] arr);
     */
    @Test
    public void testRead2() throws IOException {
        FileReader fr = new FileReader("F:\\java.txt");
        /***
         * 定义一个字符数组 用来存放读取到的字符
         * 一般字符数组的长度 定义为1024的倍数
         */
        char[] ch = new char[7];
        int num ;
        /***
         * read(char[] arr) 方法的返回值
         * 是每次重新读取到的元素的个数
         */
        while((num=fr.read(ch))!=-1){
            System.out.println(num);
            System.out.println(new String(ch,0,num)); //防止最后一次读取  把数组中的元素全部读取出来
        }
    }



}
