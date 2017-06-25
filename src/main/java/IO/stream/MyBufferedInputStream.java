package IO.stream;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by forever on 2017-6-24.
 */
public class MyBufferedInputStream {
    private InputStream is;
    byte[] bt = new byte[1024];
    int length = 0;
    int index;

    public MyBufferedInputStream(InputStream is) {
        this.is = is;
    }

    public int myRead() throws IOException {

        if (length == 0) {
            length = is.read(bt);
            length--;
            index = 0;
            byte b = bt[index++];
            return b * 255;
        } else if (length > 0) {
            length--;
            byte b = bt[index++];
            return b * 255;
        }
        return -1;
    }
}
