package IO.BufferIo;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/**
 * Created by forever on 2017-6-22.
 */
public class MyReadLine {

    private Reader reader;

    private char[] chArr = new char[1024];

    public MyReadLine(Reader reader) {
        this.reader = reader;
    }

    public String readLine() throws IOException {
        int ch;
        int i = 0;
        for (; (ch = reader.read()) != -1; i++) {
            if (i == chArr.length)
                chArr = Arrays.copyOf(chArr, chArr.length * 2);
            if ( (char) ch == '\r'||(char)ch=='\n'){
                continue;
            }

            chArr[i] = (char) ch;
        }
        if(i==0)
            return  null;
        return new String(chArr, 0, i-1);
    }


    public static void main(String[] args) throws IOException {
        MyReadLine myReadLine = new MyReadLine(new FileReader("F:\\buffer.txt"));
        String line ;
        while((line=myReadLine.readLine())!=null){
            System.out.println(line.toString());
        }
    }
}
