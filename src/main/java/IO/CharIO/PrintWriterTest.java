package IO.CharIO;

import org.junit.Test;

import java.io.*;

/**
 * Created by forever on 2017-6-27.
 */
public class PrintWriterTest {

    public static void main(String[] args) throws IOException {
        test1();
    }


    /***
     * 构造函数可以设置自动刷新
     * @throws IOException
     */
    public static void test1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        String line;
        while ((line = br.readLine()) != null) {
            /***
             * println方法可以自动换行
             */
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
