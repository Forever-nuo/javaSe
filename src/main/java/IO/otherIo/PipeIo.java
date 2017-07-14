package IO.otherIo;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流
 * Created by forever on 2017-6-28.
 */

class Read implements  Runnable{

    private PipedInputStream pis ;

    public Read(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        byte[] bt = new byte[1024];
        try {
            int len;
            while((len = pis.read(bt))!=-1){
                System.out.println(new String(bt,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Write implements  Runnable{

    private PipedOutputStream pos ;

    public Write(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {

        try {
            FileInputStream file = new FileInputStream("H:\\testFile\\file.txt");
            byte[] bt = new byte[1024];
           int len;
            while((len=file.read(bt))!=-1){
                pos.write(bt,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class PipeIo {
    @Test
    public void test() throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);
        new Thread(new Write(pos)).start();
        new Thread(new Read(pis)).start();
    }
}
