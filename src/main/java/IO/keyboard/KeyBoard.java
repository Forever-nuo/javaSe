package IO.keyboard;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by forever on 2017-6-24.
 */
public class KeyBoard {

    /***
     * 键盘录入会 录入回车 换行符 2个 \r\n
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
    /*    InputStream is = System.in;
        int read1 = is.read();
        int read2 = is.read();
        int read3 = is.read();
        System.out.println(read1);
        System.out.println(read2);
        System.out.println(read3);*/
        test1();
    }


    /***
     * 键盘录入一行一行的输出
     * @throws IOException
     */
    public static void test1() throws IOException {
        InputStream is = System.in;
        StringBuilder builder = new StringBuilder();
        while(true){
            int read = is.read();
            char ch = (char)read;
            if(ch=='\r'){
                continue;
            }
            if (ch == '\n') {
                String str = builder.toString();
                System.out.println(str);
                if("over".equals(str)){
                    break;
                }
                builder.delete(0,str.length());
                continue;
            }
            builder.append(ch);
        }
    }



}
