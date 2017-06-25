package IO.keyboard;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import commonFunction.SystemTest;

import java.io.*;

/**
 * Created by forever on 2017-6-24.
 */
public class InputStreamReaderTest {


    /****
     * 转换流
     * 将字节流 转换成字符流
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
       /* test();*/
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("over".equals(line))
                break;
            System.out.println(line.toUpperCase());
        }*/

      /*  testTable();*/
        testTable1();
    }


    /***
     * OutputStreamWriter
     */
    public static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = br.readLine()) != null) {
            if ("over".equals(line))
                break;
            bw.write(line.toUpperCase());
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }

    /***
     * 以指定编码 读取文件
     * @throws IOException
     */
    public static void testTable() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\table0.txt"),"utf-8"));
        String line;
        while ((line = br.readLine()) != null) {
            if("over".equals(line))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }


    /***
     * 以特定编码写文件
     * @throws IOException
     */
    public static void testTable1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\table3.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = br.readLine()) != null) {
            if("over".equals(line))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }


}
