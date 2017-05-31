package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by forever on 2017-5-18.
 */
public class InputFile {

    private BufferedReader in;

    public InputFile(String fileName) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("关闭文件失败");
            } finally {
                //不在此处关闭
            }
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {

            throw  new RuntimeException("调用失败");
        }
        return s;
    }

  void dispose(){
      try {
          in.close();
      } catch (IOException e) {
          throw new RuntimeException("dispose() 调用失败");
      }
  }
}
