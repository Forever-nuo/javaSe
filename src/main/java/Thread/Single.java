package Thread;

/**
 * Created by forever on 2017-6-4.
 */
public class Single {
    private static Single single = new Single();

    private  Single (){}

    public  static Single getSingle (){
        return  single;
    }

}
