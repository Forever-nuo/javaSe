package IO.stream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by forever on 2017-6-24.
 */
public class CopyStream {

    /****
     * 拷贝文件
     * @throws IOException
     */
    @Test
    public void testCopy() throws IOException {
        FileInputStream fis = new FileInputStream("H:\\settings.jar");
        FileOutputStream fos = new FileOutputStream("H:\\copy.jar");
        byte[] b = new byte[1024];
        int num;
        while((num=fis.read(b))!=-1){
            fos.write(b,0,num);
        }
    }
}
