package exception;

import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;

/**
 * Created by forever on 2017-5-18.
 */

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}


abstract class Inning {
    public Inning(){
    }

    public void event() throws  NullPointerException{
    }

    public abstract  void atBat()throws Foul,Strike;

    public void walk(){

        throw new RuntimeException();
    }
}

class StormException extends  Exception{}

class RaineOut extends  StormException{}

class PopFoul extends  Foul{}

interface  Storm {
    public void event() throws  RaineOut;
    public  void rainWard() throws RaineOut,BaseballException;
}


class stormInning extends  Inning implements Storm{
    public stormInning() {
        //super();
    }

    public stormInning(String s) throws Foul,BaseballException {
    }
    @Override
    public void atBat() throws PopFoul{

    }


    /***
     * 只能明 父类异常的子集 要么不抛
     * 如果要抛自己的异常
     * 1.可以抛runtime异常
     * 2.在内部自己try catch 处理
     *
     * @throws RaineOut
     */
    @Override
    public void rainWard() throws  RaineOut{
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void event(){}

    @Override
    public void walk() {

    }

    public static void main(String[] args) {

            Inning in = new stormInning();
            in.walk();


    }
}

public class OverException {
}
