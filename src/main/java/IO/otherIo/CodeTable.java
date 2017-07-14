package IO.otherIo;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by forever on 2017-6-29.
 */
public class CodeTable {

    /***
     * 用什么码编的就用什么码解
     * @throws UnsupportedEncodingException
     */
    @Test
    public void testCode() throws UnsupportedEncodingException {
        String str = "你好";
        byte[] bytes = str.getBytes("gbk"); //编码
        System.out.println("编码后的字节数组:"+Arrays.toString(bytes));
        String str2 = new String(bytes,"iso8859-1");
        //System.out.println(str2); //默认是跟系统一样的 (本系统是utf-8)  已经乱码
        byte[] bytes1 = str2.getBytes("iso8859-1");  //  再进行同样的编码

        System.out.println("解码错在进行编码的字节数组:"+Arrays.toString(bytes1));


        String str3 = new String(bytes1,"gbk");
        System.out.println(str3);

        System.out.println(Arrays.toString(bytes));
    }


    /***
     * utf-8 和gbk之间的乱码
     * 都识别中文 转不过来
     * @throws UnsupportedEncodingException
     */
    @Test
    public void testCode1() throws UnsupportedEncodingException {
        String str = "你好";
        byte[] bytes = str.getBytes("gbk"); //编码
        System.out.println("编码后的字节数组:"+Arrays.toString(bytes));
        String str2 = new String(bytes,"utf-8");
        //System.out.println(str2); //默认是跟系统一样的 (本系统是utf-8)  已经乱码
        byte[] bytes1 = str2.getBytes("utf-8");  //  再进行同样的编码

        System.out.println("解码错在进行编码的字节数组:"+Arrays.toString(bytes1));

        String str3 = new String(bytes1,"gbk");
        System.out.println(str3);

        System.out.println(Arrays.toString(bytes));
    }

    @Test
    public void testLianTong() throws UnsupportedEncodingException {
        String str = "联通";
        byte[] bytes = str.getBytes("gbk");
        for (byte aByte : bytes) {
            System.out.println(Integer.toBinaryString(aByte&255));
        }
    }
}
