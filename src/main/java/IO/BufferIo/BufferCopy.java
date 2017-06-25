package IO.BufferIo;

import org.junit.Test;

import java.io.*;

/**
 * Created by forever on 2017-6-22.
 */
public class BufferCopy {

    @Test
    public void testCopy() {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try {
            bufr = new BufferedReader(new FileReader("F:\\buffer.txt"));
            bufw = new BufferedWriter(new FileWriter("F:\\copyBuffer.txt"));
            String line;
            while ((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufr != null)
                try {
                    bufr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bufw != null)
                try {
                    bufw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    String myReadLine(){

        return null;
    }


}
