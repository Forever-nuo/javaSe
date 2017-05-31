package exception;

/**
 * Created by Administrator on 2017/5/16.
 */
public class MyException extends Throwable {
    String message;

    public MyException() {
        super();
    }

    public MyException(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }
}
