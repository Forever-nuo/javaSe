package IO.otherIo;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile不是IO体系中的
 * 而是直接继承Object
 * 但是是IO包中的成员 因为它有读写功能
 * 内部封装了数组 而且通过指针对数组元素进行操作
 *
 * 通过 getFilePointer获取指针位置
 * 可以通过seek改变位置
 *
 *
 * 有读写功能 内部封装了 字节读取流和输出流
 * Created by forever on 2017-6-28.
 */
public class RandomAccessFileTest {


    @Test
      public void testWrite() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("H:\\testFile\\random.txt","rw");
        raf.write(97);  //write方法 只写 最低8位
        raf.write("问答".getBytes());
        raf.close();
    }

    @Test
    public void testWriteInt() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("H:\\testFile\\random.txt","rw");
        raf.writeInt(97);  //write方法 只写 最低8位
        raf.write("问答".getBytes());
        raf.close();
    }

    @Test
    public void testRead() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("H:\\testFile\\random.txt","rw");
        byte[] bt = new byte[4];
        int len = raf.read(bt);
        raf.readInt();
        System.out.println(new String(bt, 0, len));
    }


    /***
     * 调整指针
     */
    @Test
    public void testSeek() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("H:\\testFile\\random.txt","rw");
        raf.seek(8 );
        raf.read();
    }

    @Test
    public void testSkipBytes()throws IOException {
        RandomAccessFile raf = new RandomAccessFile("H:\\testFile\\random.txt","rw");
        raf.skipBytes(10);

    }
}
