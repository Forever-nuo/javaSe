package commonFunction;

import org.junit.Test;

import java.io.IOException;

/**
 * Runtime该类特点
 * <p/>
 * <p/>
 * 1.该类没有构造函数
 * 2.想到方法都是静态的,但是类中有非静态的
 * 3.想到该类中应该有个静态方法返回 本类对象
 * 4. 想到单例模式
 * Created by forever on 2017-6-19.
 */
public class RuntimeTest {


    /***
     * 运行 执行方法
     *
     * 可以执行命令
     *
     * 返回值 :返回一个进程
     * @throws IOException
     */
    @Test
    public void testExec() throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("F:\\软件\\多媒体\\娱乐\\YY语音\\yy\\YY.exe");
        Thread.currentThread().sleep(3000);
        process.destroy();
    }

    /***
     * 打开记事本
     * 记事本并且打开某个文件
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        Runtime.getRuntime().exec("notepad RuntimeTest.java");
    }
}
