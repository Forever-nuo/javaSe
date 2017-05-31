package basisIntroduction.function;

import java.util.Arrays;

/**
 * Created by forever on 2017-4-19.
 */
public class MainFunction {

    /**
     * String [] args = new String[0];
     * String [] args ={};
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(args.length); //args.length=0
    }
}

class MainFunction1{
    public static void main(String[] args) {
        String [] str = {"东","南","西","北"};
        MainFunction.main(str);
    }
}
