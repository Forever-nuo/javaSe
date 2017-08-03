package IO.otherTest;

import org.junit.Test;

import java.io.*;

/**
 * Created by Administrator on 2017/7/12.
 */
public class page {

    @Test
    public void test1() throws IOException {

        BufferedReader fr= new BufferedReader(new InputStreamReader( new FileInputStream("D:\\testFile\\页数1.txt")));
        int count = 0;
        String str =null;
        while((str=fr.readLine())!=null)
             System.out.println(str);

        System.out.println(count);
    }

    @Test
    public void test2() {
        System.out.println('\f'+0);
    }
}
