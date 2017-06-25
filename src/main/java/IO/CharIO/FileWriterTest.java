package IO.CharIO;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by forever on 2017-6-20.
 */
public class FileWriterTest {

    /**
     * 构造函数方法
     *
     * @throws IOException
     */
    @Test
    public void testConstructFunction() throws IOException {
        /**
         * 第一步创建文件 字符输出流对象
         * 明确输出文字
         *
         *@1.如果文件不存在,会自动创建文件
         *@2.如果文件存在,会重写并且创建文件
         */
        FileWriter fw = new FileWriter("F:\\java.txt");

        fw.write("abcdefgabcdefgabcdefgabc");

        fw.flush();
    }


    @Test
    public void testConstructFunction1() throws IOException {
        /**
         * 第一步创建文件 字符输出流对象
         * 明确输出文字
         *
         *@1.如果文件不存在,会自动创建文件
         *@2.如果文件存在, 在文件后追加文字
         *
         * 参数2: 用来解决 已存在文件的被重写问题
         */
        FileWriter fw = new FileWriter("F:\\java.txt", true);

        fw.write("张三");

        fw.close();
    }


    @Test
    public void testWrite() throws IOException {
        FileWriter fw = new FileWriter("F:\\java.txt", true);

        /****
         * 将数据 写进流管道中
         * 此时数据 还没写进指定的文件中(目的地)
         */
        fw.write("张三");
    }

    @Test
    public void testFlush() throws IOException {
        FileWriter fw = new FileWriter("F:\\java.txt");

        /****
         * 将数据 写进流管道中
         * 此时数据 还没写进指定的文件中(目的地)
         */
        fw.write("张三");

        /***
         * 将管道中的数据刷新到  目的地
         */
        fw.flush();

        fw.write("王五");

        /**
         * 刷新之后可以继续再输出数据
         * 进行刷新
         *
         */
        fw.flush();

    }


    @Test
    public void testClose() throws IOException {
        FileWriter fw = new FileWriter("F:\\java.txt");

        /****
         * 将数据 写进流管道中
         * 此时数据 还没写进指定的文件中(目的地)
         */
        fw.write("张三");
        /***
         * 将管道中的数据刷新到  目的地
         */
        fw.flush();
        fw.write("王五");

        /****
         * 关闭流 管道
         * 同时刷新流中的数据
         */
        fw.close();
        /***
         * 流关闭之后不可以再写
         */
        // fw.write("aaa");
    }

    @Test
    public void testAll() throws IOException {
        /**
         * 第一步创建文件 字符输出流对象
         * 明确输出文字
         *
         *@1.如果文件不存在,会自动创建文件
         *@2.如果文件存在, 会刷新重写文件
         *
         */
        FileWriter fw = new FileWriter("F:\\java.txt");
        /***
         * 第二步  输出数据到流中
         */
        fw.write("输出数据到流中");

        /**
         * 过程中 多次写 可以多次刷新
         * 可以用循环控制 ,进行多次刷新
         */
        fw.flush();
        ;
        fw.write("第二次输出数据");
        /***
         * 最终  关闭流
         */
        fw.close();
    }


    /***
     * 流中的  异常处理结构
     */
    @Test
    public void testException() {
        FileWriter fw = null;  //  定义在外面
        try {
            fw = new FileWriter("F:\\java.txt");
            fw.write("输出数据到流中");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {  //finally 块中 关闭流
            try {
                if (fw != null)  //判断  如果初始化时创建对象 抛出异常 fw =null  就会空指针异常
                    fw.close();
            } catch (IOException e) {  //close 方法也要异常处理
                e.printStackTrace();
            }
        }
    }


    /***
     * 在windows的软件中
     * 换行的操作符是 \r\n
     */
    @Test
    public void testNewLine() {

        FileWriter fw = null;
        try {
            fw= new FileWriter("F:\\java.txt",true);
            fw.write("第一行数据\r\n新的一行数据");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
